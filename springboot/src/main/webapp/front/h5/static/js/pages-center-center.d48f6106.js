(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"27ae":function(r,e,i){"use strict";i.r(e);var o=i("55b4"),t=i.n(o);for(var a in o)"default"!==a&&function(r){i.d(e,r,(function(){return o[r]}))}(a);e["default"]=t.a},"55b4":function(r,e,i){"use strict";var o=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("96cf");var t=o(i("3b8d")),a=o(i("2971")),n={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var r=(0,t.default)(regeneratorRuntime.mark((function r(){var e,i,o;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.role=uni.getStorageSync("role"),e=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(e);case 4:i=r.sent,this.user=i.data,this.tableName=e,o=a.default.list(),this.menuList=o;case 9:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),onShow:function(){var r=(0,t.default)(regeneratorRuntime.mark((function r(){var e,i,o;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),e=uni.getStorageSync("nowTable"),r.next=5,this.$api.session(e);case 5:i=r.sent,this.user=i.data,this.tableName=e,o=a.default.list(),this.menuList=o;case 10:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),methods:{onPageTap:function(r){uni.setStorageSync("useridTag",1),uni.navigateTo({url:r,fail:function(){uni.switchTab({url:r})}})}}};e.default=n},"71cb":function(r,e,i){var o=i("be9d");"string"===typeof o&&(o=[[r.i,o,""]]),o.locals&&(r.exports=o.locals);var t=i("4f06").default;t("75282a1a",o,!0,{sourceMap:!1,shadowMode:!1})},be09:function(r,e,i){"use strict";var o=i("71cb"),t=i.n(o);t.a},be9d:function(r,e,i){var o=i("24fb");e=o(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */uni-page-body[data-v-3f03f0cf]{background-color:#fff}.content[data-v-3f03f0cf]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220213/cbae2a38741b48e8a53f0cb098319c7d.png);background-attachment:fixed;background-size:cover;background-position:50%}.header[data-v-3f03f0cf]{background-color:#ff6364;width:100%;height:30vw;padding:0 4%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center}.header.status[data-v-3f03f0cf]{padding-top:0}.header .userinfo[data-v-3f03f0cf]{width:100%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center}.header .userinfo .face[data-v-3f03f0cf]{-webkit-flex-shrink:0;flex-shrink:0;width:15vw;height:15vw;overflow:hidden}.header .userinfo .face uni-image[data-v-3f03f0cf]{width:100%;height:100%}.header .userinfo .info[data-v-3f03f0cf]{-webkit-flex-flow:wrap;flex-flow:wrap}.header .userinfo .info .username[data-v-3f03f0cf]{width:100%;color:#fff;font-size:%?40?%;margin:%?8?% 0}.header .userinfo .info .integral[data-v-3f03f0cf]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:0 %?8?%;color:#fff;background-color:rgba(0,0,0,.1);border-radius:%?20?%;font-size:%?24?%;margin:%?8?% 0}.header .setting[data-v-3f03f0cf]{-webkit-flex-shrink:0;flex-shrink:0}.header .setting uni-image[data-v-3f03f0cf]{width:100%;height:100%}.hover[data-v-3f03f0cf]{background-color:#eee}.orders[data-v-3f03f0cf]{background-color:#ff6364;width:100%;height:11vw;padding:0 4%;margin-bottom:calc(11vw + %?40?%);display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:start;-webkit-align-items:flex-start;align-items:flex-start;border-radius:0 0 100% 100%;margin-top:%?-1?%}.orders .box[data-v-3f03f0cf]{width:100%;padding:0 1%;height:22vw;background-color:#fefefe;border-radius:%?24?%;box-shadow:0 0 %?20?% rgba(0,0,0,.15);margin-bottom:%?40?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center}.orders .box .label[data-v-3f03f0cf]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-flow:wrap;flex-flow:wrap;width:100%;height:16vw;color:#666;font-size:%?26?%}.orders .box .label .icon[data-v-3f03f0cf]{position:relative;width:7vw;height:7vw;margin:0 1vw}.orders .box .label .icon .badge[data-v-3f03f0cf]{position:absolute;width:4vw;height:4vw;background-color:#ec6d2c;top:-1vw;right:-1vw;border-radius:100%;font-size:%?20?%;color:#fff;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;z-index:10}.orders .box .label .icon uni-image[data-v-3f03f0cf]{width:7vw;height:7vw;z-index:9}.list[data-v-3f03f0cf]{width:100%;border-bottom:solid %?26?% #f1f1f1;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-flex-wrap:wrap;flex-wrap:wrap}.list .li[data-v-3f03f0cf]{width:100%;height:%?100?%;padding:0 4%;border-bottom:solid %?1?% #e7e7e7;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;background:#fff;font-size:%?33?%;-webkit-flex-wrap:wrap;flex-wrap:wrap}.list .li.noborder[data-v-3f03f0cf]{border-bottom:0}.list .li .icon[data-v-3f03f0cf]{-webkit-flex-shrink:0;flex-shrink:0;width:%?50?%;height:%?50?%}.list .li .icon uni-image[data-v-3f03f0cf]{width:%?50?%;height:%?50?%}.list .li .text[data-v-3f03f0cf]{padding-left:%?20?%;width:100%;color:#666}.list .li .to[data-v-3f03f0cf]{-webkit-flex-shrink:0;flex-shrink:0;width:%?40?%;height:%?40?%}body.?%PAGE?%[data-v-3f03f0cf]{background-color:#fff}',""]),r.exports=e},c539:function(r,e,i){"use strict";var o,t=function(){var r=this,e=r.$createElement,i=r._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"header",class:{status:r.isH5Plus},style:{padding:"0 24rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0, 186, 189, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"260rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onPageTap("../user-info/user-info")}}},["yonghu"==r.tableName?i("v-uni-view",{staticClass:"userinfo",style:{padding:"24rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"20rpx 0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0, 0, 0, 0)",borderRadius:"16rpx",borderWidth:"0",width:"calc(100% - 112rpx)",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"info"},[i("v-uni-view",{staticClass:"username",style:{padding:"0",boxShadow:"0 0 16rpx rgba(255,255,255,0)",margin:"6rpx 0",backgroundColor:"rgba(0,0,0,0)",borderColor:"rgba(255,255,255,.3)",color:"#fff",textAlign:"left",borderRadius:"8rpx",borderWidth:"0",width:"auto",lineHeight:"36rpx",fontSize:"24rpx",borderStyle:"solid"}},[r._v(r._s(r.user.yonghuzhanghao)),r.user.vip&&"是"==r.user.vip?i("v-uni-text",[r._v("(VIP)")]):r._e()],1)],1)],1):r._e(),"faburen"==r.tableName?i("v-uni-view",{staticClass:"userinfo",style:{padding:"24rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"20rpx 0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0, 0, 0, 0)",borderRadius:"16rpx",borderWidth:"0",width:"calc(100% - 112rpx)",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"info"},[i("v-uni-view",{staticClass:"username",style:{padding:"0",boxShadow:"0 0 16rpx rgba(255,255,255,0)",margin:"6rpx 0",backgroundColor:"rgba(0,0,0,0)",borderColor:"rgba(255,255,255,.3)",color:"#fff",textAlign:"left",borderRadius:"8rpx",borderWidth:"0",width:"auto",lineHeight:"36rpx",fontSize:"24rpx",borderStyle:"solid"}},[r._v(r._s(r.user.faburenzhanghao)),r.user.vip&&"是"==r.user.vip?i("v-uni-text",[r._v("(VIP)")]):r._e()],1)],1)],1):r._e(),i("v-uni-view",{staticClass:"setting"},[i("v-uni-view",{staticClass:"cuIcon-settings",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0 0 0 80rpx",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0,0,0,0)",borderRadius:"0",color:"#fff",borderWidth:"0",width:"32rpx",lineHeight:"32rpx",fontSize:"32rpx",borderStyle:"solid"}})],1)],1),i("v-uni-view",{staticClass:"list",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"20rpx auto",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",borderRadius:"20rpx",borderWidth:"0",width:"90%",borderStyle:"solid",height:"auto"}},[r._l(r.menuList,(function(e){return[r._l(e.backMenu,(function(o,t){return r.role==e.roleName?[r._l(o.child,(function(e,o){return["yifahuodingdan"!=e.tableName&&"yituikuandingdan"!=e.tableName&&"yiquxiaodingdan"!=e.tableName&&"weizhifudingdan"!=e.tableName&&"yizhifudingdan"!=e.tableName&&"yiwanchengdingdan"!=e.tableName?i("v-uni-view",{key:o+"_0",staticClass:"li",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",backgroundColor:"#fff",borderColor:"rgba(235, 235, 235, 1)",borderRadius:"0",borderWidth:"0 0 2rpx",width:"100%",borderStyle:"solid",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=r.$handleEvent(i),r.onPageTap("../"+e.tableName+"/list?userid="+r.user.id)}}},[i("v-uni-view",{class:e.appFrontIcon,style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(246, 185, 63, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"30rpx",lineHeight:"30rpx",fontSize:"30rpx",borderStyle:"solid"}}),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"calc(100% - 92rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(e.menu))]),i("v-uni-view",{staticClass:"cuIcon-right",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(161, 161, 161, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",borderStyle:"solid"}})],1):r._e()]}))]:r._e()}))]})),i("v-uni-view",{staticClass:"li",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",backgroundColor:"#fff",borderColor:"rgba(235, 235, 235, 1)",borderRadius:"0",borderWidth:"0 0 2rpx",width:"100%",borderStyle:"solid",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onPageTap("../chat/chat")}}},[i("v-uni-view",{staticClass:"cuIcon-service",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(246, 185, 63, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"30rpx",lineHeight:"30rpx",fontSize:"30rpx",borderStyle:"solid"}}),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"calc(100% - 92rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("在线客服")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(161, 161, 161, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",borderStyle:"solid"}})],1),i("v-uni-view",{staticClass:"li",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",backgroundColor:"#fff",borderColor:"rgba(235, 235, 235, 1)",borderRadius:"0",borderWidth:"0 0 2rpx",width:"100%",borderStyle:"solid",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onPageTap("../forum-add-or-update/forum-add-or-update")}}},[i("v-uni-view",{staticClass:"cuIcon-scan",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(246, 185, 63, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"30rpx",lineHeight:"30rpx",fontSize:"30rpx",borderStyle:"solid"}}),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"calc(100% - 92rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("我要发贴")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(161, 161, 161, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",borderStyle:"solid"}})],1),i("v-uni-view",{staticClass:"li",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",backgroundColor:"#fff",borderColor:"rgba(235, 235, 235, 1)",borderRadius:"0",borderWidth:"0 0 2rpx",width:"100%",borderStyle:"solid",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onPageTap("../forum-my/forum-my")}}},[i("v-uni-view",{staticClass:"cuIcon-scan",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(246, 185, 63, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"30rpx",lineHeight:"30rpx",fontSize:"30rpx",borderStyle:"solid"}}),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"calc(100% - 92rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("我的发贴")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{padding:"0",boxShadow:"0 0 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(0,0,0,0)",backgroundColor:"#fff",color:"rgba(161, 161, 161, 1)",isShow:!0,borderRadius:"0",borderWidth:"0",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",borderStyle:"solid"}})],1)],2)],1)},a=[];i.d(e,"b",(function(){return t})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return o}))},d2c0:function(r,e,i){"use strict";i.r(e);var o=i("c539"),t=i("27ae");for(var a in t)"default"!==a&&function(r){i.d(e,r,(function(){return t[r]}))}(a);i("be09");var n,d=i("f0c5"),l=Object(d["a"])(t["default"],o["b"],o["c"],!1,null,"3f03f0cf",null,!1,o["a"],n);e["default"]=l.exports}}]);