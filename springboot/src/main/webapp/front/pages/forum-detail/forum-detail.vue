<template>
	<view>
		<view class="title">
			{{forum.title}}
		</view>
		<view class="username">
			发布人：{{forum.username}}
		</view>
		<view class="content">
			<rich-text :nodes="forum.content"></rich-text>
		</view>
		<view class="uni-article__comment">
			<view class="uni-article__comment-box" v-for="comment in commentData" :key="comment.id">
				<view class="article-meta">
					<view class="article-header-image">
						<image class="image" src="/static/logo.png" mode="widthFix"></image>
					</view>
					<view class="article-header-content">
						<view class="article-header-title">
							<text>用户:{{comment.username}}</text>
						</view>
						<view class="article-header-info"> {{comment.addtime||''}}</view>
					</view>
				</view>
				<view class="uni-article__comment-centent">
					<user-reply v-if="comment.childs" :digest="comment.childs"></user-reply>
					{{comment.content}}
					<text class="btn-replay" @tap="onReplyTap(comment.id)">回复</text>
				</view>
			</view>
			
			<view class="bottom-content">
				<button @tap="onReplyTap(forum.id)" class="bg-red margin-tb-sm">评论</button>
			</view>
		</view>
	</view>
</template>
<script>
	import userReply from '@/components/forum-reply/forum-reply.vue'
	export default {
		components: {
			userReply
		},
		data() {
			return {
				commentData: [],
				forum: {},
				id: '',
			}
		},
		async onLoad(options) {
			this.id = options.id;
			let res = await this.$api.forumDetail(options.id)
			this.commentData = res.data.childs;
			this.forum = res.data;
			console.log(this.commentData)
		},
		async onShow() {
			let res = await this.$api.forumDetail(this.id)
			this.commentData = res.data.childs;
			this.forum = res.data;
		},
		methods: {
			onReplyTap(pid) {
				this.$utils.jump(`../forum-reply/forum-reply?pid=${pid}`);
			}
		}
	}
</script>

<style scoped>
	page {
		background: #FFFFFF;
	}

	.title {
		text-align: center;
		font-size: 40upx;
		font-weight: bold;
		margin: 20upx;
	}
	
	.username{
		text-align: center;
		font-size: 20upx;
		font-weight: bold;
		color: #888888;
		margin: 20upx;
	}
	
	.content {
		margin: 40upx;
		font-size: 30upx;
		line-height: 50upx;
		letter-spacing: 5upx;
	}

	.article-meta {
		padding: 20rpx 20rpx;
		display: flex;
		align-items: center;
		flex-direction: row;
		justify-content: flex-start;
		color: gray;
	}

	.article-header-image {
		width: 60rpx;
		height: 60rpx;
		flex-shrink: 0;
		/* border-radius: 50%; */
		overflow: hidden;
	}

	.article-header-image .image {
		width: 100%;
		height: 100%;
	}

	.article-header-content {
		display: flex;
		flex-direction: column;
		justify-content: center;
		padding-left: 10px;
		font-size: 24rpx;
		line-height: 1;
		width: 100%;
		/* height: 60rpx; */
	}

	.article-header-title {
		display: flex;
		justify-content: space-between;
		align-items: center;
		font-size: 26rpx;
		line-height: 2;
		color: #000;
	}

	.article-header-info {
		font-size: 24rpx;
		line-height: 1;
	}

	.article-top {
		display: flex;
		align-items: flex-end;
		font-size: 26rpx;
		line-height: 1;
		color: #999;
	}

	.article-top .image {
		width: 30rpx;
		margin-left: 5rpx;
	}

	.uni-article__comment {
		margin-bottom: 160upx;
	}

	.uni-article__comment-title {
		width: 100%;
		line-height: 3;
		font-size: 28rpx;
		color: #666;
		background: #f5f5f5;
		padding-left: 20rpx;
	}

	.uni-article__comment-centent {
		border-bottom: 1px #eee solid;
		padding: 0 20rpx;
		padding-left: 95rpx;
		padding-bottom: 20rpx;
		font-size: 14px;
		color: #333;
	}

	.btn-replay {
		color: red;
		float: right;
	}
	
	.bottom-content{
		position: fixed;
		bottom: 0;
		padding: 20upx;
		width: 100%;
	}
</style>
