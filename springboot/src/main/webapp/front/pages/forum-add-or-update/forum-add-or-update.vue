<template>
	<view class="container my-publish-pv" :style='{"padding":"24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"24rpx 5%","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0.39)","borderRadius":"20rpx","borderWidth":"0","width":"90%","borderStyle":"solid","height":"auto"}'>
		<form>
			<view class="cu-form-group margin-top" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<input :style='{"padding":"0 20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 20rpx 0 0","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="forum.title" placeholder="标题"></input>
			</view>
			<view class="cu-form-group margin-top" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<!-- <radio-group>
					<label class="radio">
						<radio @tap="setIsDoneTap('开放')" style="margin: 0 20upx;" value="开放" :checked="forum.isdone=='开放'" /><text>开放</text>
						<radio @tap="setIsDoneTap('关闭')" style="margin: 0 20upx;" value="关闭" :checked="forum.isdone=='关闭'" /><text>私人</text>
					</label>
				</radio-group> -->
				<picker @change="setIsDoneTap" :value="index" :range="options">
					<view class="uni-picker-type" :style='{"padding":"0 20rpx","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"20rpx 20rpx 0 0","borderWidth":"0","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}'>{{options[index]}}</view>
				</picker>
			</view>
			<view class="cu-form-group margin-top" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0 0 20rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(0, 0, 0, 1)","borderRadius":"20rpx 20rpx 0 0","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"300rpx"}' style="height: 500upx;" v-model="forum.content" placeholder="内容"></textarea>
			</view>
			<view class="cu-form-group margin-top" style="text-align:center">
				<button :style='{"padding":"0 20rpx","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"20rpx 0","borderColor":"rgba(37, 147, 230, 1)","backgroundColor":"rgba(37, 147, 230, 1)","color":"#fff","borderRadius":"80rpx","borderWidth":"1","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red margin-tb-sm">确认提交</button>
			</view>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				forum: {
					content: '',
					id: '',
					title: '',
					isdone: '开放',
					parentid: 0
				},
				index: 0,
				options: ['开放', '关闭'],
				username: '',
				user: {}
			}
		},
		async onLoad(options) {
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
                                                                                                                                                                        						            			            			            			            			            			            			            			            			if (options.id) {
				this.id = options.id;
				let res = await this.$api.info('forum',this.id);
				this.forum = res.data
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.my-publish-pv .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.myPublishForm.content.input.backgroundColor
					// })
				})
			},
			async onSubmitTap() {
				this.forum.username = this.username;
				if (this.id) {
					await this.$api.update('forum',this.forum);
				} else {
					await this.$api.save('forum',this.forum);
				}
				this.$utils.msgBack('操作成功');
			},
			setIsDoneTap(e) {
				// this.forum.isdone = e;
				this.index = e.target.value
				this.forum.isdone = this.options[this.index]
			},
		}
	}
</script>

<style>
	page {
		background-color: #fff;
	}
	
	.container {
		padding: 20upx 24upx;
	}
	
	.container:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20220213/9ee67e80266a46eb92e20b8ca0de61e7.png);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}
	
	.cu-form-group {
		padding: 0;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 80rpx;
	}
	.bg-red {
		line-height: 80rpx;
	}
</style>
