<template>
	<view class="progress_box">
		<canvas class="progress_bg" canvas-id="cpbg"
			:style="{width:progress_width+'px',height:progress_height+'px'}"></canvas>
		<canvas class="progress_bar" canvas-id="cpbar"
			:style="{width:progress_width+'px',height:progress_height+'px'}"></canvas>
	</view>
</template>
<script>
	/**
	 * circleProgress 自己写的环形进度条
	 * @property {String Number} value 圆环进度百分比值，为数值类型，0-100(默认必传).
	 * @property {String Number} progress_time 圆环进度总时间
	 * @property {String Number} border_width 圆环边框宽度
	 * @property {String Number} progress_width 圆环宽度(建议宽高一致)
	 * @property {String Number} progress_height 圆环高度（建议宽高一致）
	 * @property {String} bg_color 圆环的背景色
	 * @property {String} start_color 圆环开始渐变色
	 * @property {String} bg_color 圆环结束渐变色
	 */
	export default {
		props: {
			value: {
				type: Number,
				default: 25,
				required: true
			},
			progress_time: {
				type: Number,
				default: 1500
			},
			progress_width: {
				type: Number,
				default: 250
			},
			progress_height: {
				type: Number,
				default: 125
			},
			border_width: {
				type: Number,
				default: 12
			},
			bg_color: {
				type: String,
				default: '#E2E2E2'
			},
			start_color: {
				type: String,
				default: '#FFE97C'
			},
			end_color: {
				type: String,
				default: '#FFE97C'
			},
		},
		data() {
			return {
				percent: 0, // 保存进度值的变化前后值，用于比较用
			}
		},
		mounted() {
			this.drawProgressbg();
			this.drawCircle(this.value);
		},
		methods: {
			// 背景
			drawProgressbg: function() {
				// 自定义组件实例 this ，表示在这个自定义组件下查找拥有 canvas-id 的 <canvas/>
				let ctx = uni.createCanvasContext('cpbg', this);
				ctx.setLineWidth(this.border_width);
				ctx.setStrokeStyle(this.bg_color);
				ctx.setLineCap('round');
				ctx.beginPath();
				ctx.arc(125, 125, 100, 0.99 * Math.PI, 0.01 * Math.PI, false);
				ctx.stroke();
				ctx.draw();
			},
			// 画圆（递归调用）
			drawCircle: function(step) {
				if (step === 0) return;
				let time = Math.floor(this.progress_time / 100)
				let ctx = uni.createCanvasContext('cpbar', this);
				let gradient = ctx.createLinearGradient(28, 55, 192, 55);
				gradient.addColorStop('0', this.start_color);
				gradient.addColorStop('1.0', this.end_color);
				ctx.setLineWidth(this.border_width);
				ctx.setStrokeStyle(gradient);
				ctx.setLineCap('round');
				ctx.beginPath();
				step = 0.01 * step + 0.99;
				if (step === 1) {
					step = 0.99
				}
				if (step >= 2) {
					step = step % 2;
				}
				if (step === 1.99) {
					step = 0.01
				}
				ctx.arc(125, 125, 100, 0.99 * Math.PI, step * Math.PI, false);
				ctx.stroke();
				ctx.draw();
				if (this.value > this.percent) {
					this.percent++
					setTimeout(() => {
							this.drawCircle(this.percent)
						},
						time)
				}
			}
		}
	};
</script>

<style>
	.progress_box {
		position: relative;
		width: 100%;
		height: 100%;
		display: flex;
		align-items: center;
		justify-content: center;
		text-align: center;
	}

	.progress_bg {
		position: absolute;

	}
</style>
