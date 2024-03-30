<template>
	<view class="container">
		<form>
			<view class="cu-form-group">
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(0, 0, 0, 1)","borderRadius":"20rpx 20rpx 0 0","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"300rpx"}' v-model="contont" placeholder="回复"></textarea>
			</view>
			<button :style='{"padding":"0 20rpx","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"20rpx 0","borderColor":"rgba(37, 147, 230, 1)","backgroundColor":"rgba(37, 147, 230, 1)","color":"#fff","borderRadius":"80rpx","borderWidth":"1","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onReplyTap" class="bg-red margin-tb-sm">提交回复</button>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				pid: '',
				content: '',
				username: '',
				user: {},
			}
		},
		async onLoad(options) {
			this.pid = options.pid;
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
									                                    if(table == `yonghu`){
                this.username = this.user.yonghuzhanghao
            }
                                                                                                                                                                        						            						                                    if(table == `faburen`){
                this.username = this.user.faburenzhanghao
            }
                                                                                                                                                                        						            			            			            			            			            			            			            			            		},
		methods: {
			async onReplyTap() {
				await this.$api.save('forum',{
					parentid: this.pid,
					content: this.contont,
					username: this.username
				});
				this.$utils.msgBack('回复成功');
			}
		}
	}
</script>

<style>
	page {
		background-color: #fff;
	}
	
	.container {
		padding: 20upx;
	}
	
	.cu-form-group {
		padding: 0;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.bg-red {
		line-height: 80rpx;
	}
</style>
