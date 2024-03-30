<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="物品编号" prop="wupinbianhao">
            <el-input v-model="ruleForm.wupinbianhao" 
                placeholder="物品编号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.wupinbianhao" label="物品编号" prop="wupinbianhao">
              <el-input v-model="ruleForm.wupinbianhao" 
                placeholder="物品编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="物品名称" prop="wupinmingcheng">
          <el-input v-model="ruleForm.wupinmingcheng" 
              placeholder="物品名称" clearable  :readonly="ro.wupinmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="物品名称" prop="wupinmingcheng">
              <el-input v-model="ruleForm.wupinmingcheng" 
                placeholder="物品名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="物品类别" prop="wupinleibie">
          <el-select :disabled="ro.wupinleibie" v-model="ruleForm.wupinleibie" placeholder="请选择物品类别">
            <el-option
                v-for="(item,index) in wupinleibieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="物品类别" prop="wupinleibie">
	      <el-input v-model="ruleForm.wupinleibie"
                placeholder="物品类别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="物品数量" prop="wupinshuliang">
          <el-input v-model="ruleForm.wupinshuliang" 
              placeholder="物品数量" clearable  :readonly="ro.wupinshuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="物品数量" prop="wupinshuliang">
              <el-input v-model="ruleForm.wupinshuliang" 
                placeholder="物品数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.wupintupian" label="物品图片" prop="wupintupian">
          <file-upload
          tip="点击上传物品图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.wupintupian?ruleForm.wupintupian:''"
          @change="wupintupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.wupintupian" label="物品图片" prop="wupintupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.wupintupian.split(',')" :src="$base.url+item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="丢失地点" prop="diushididian">
          <el-input v-model="ruleForm.diushididian" 
              placeholder="丢失地点" clearable  :readonly="ro.diushididian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="丢失地点" prop="diushididian">
              <el-input v-model="ruleForm.diushididian" 
                placeholder="丢失地点" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="拾得时间" prop="shideshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.shideshijian" 
                type="datetime"
                :readonly="ro.shideshijian"
                placeholder="拾得时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.shideshijian" label="拾得时间" prop="shideshijian">
              <el-input v-model="ruleForm.shideshijian" 
                placeholder="拾得时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="当前位置" prop="dangqianweizhi">
          <el-select :disabled="ro.dangqianweizhi" v-model="ruleForm.dangqianweizhi" placeholder="请选择当前位置">
            <el-option
                v-for="(item,index) in dangqianweizhiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="当前位置" prop="dangqianweizhi">
	      <el-input v-model="ruleForm.dangqianweizhi"
                placeholder="当前位置" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="发布人账号" prop="faburenzhanghao">
          <el-input v-model="ruleForm.faburenzhanghao" 
              placeholder="发布人账号" clearable  :readonly="ro.faburenzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="发布人账号" prop="faburenzhanghao">
              <el-input v-model="ruleForm.faburenzhanghao" 
                placeholder="发布人账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="发布人姓名" prop="faburenxingming">
          <el-input v-model="ruleForm.faburenxingming" 
              placeholder="发布人姓名" clearable  :readonly="ro.faburenxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="发布人姓名" prop="faburenxingming">
              <el-input v-model="ruleForm.faburenxingming" 
                placeholder="发布人姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="电话号码" prop="dianhuahaoma">
          <el-input v-model="ruleForm.dianhuahaoma" 
              placeholder="电话号码" clearable  :readonly="ro.dianhuahaoma"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="电话号码" prop="dianhuahaoma">
              <el-input v-model="ruleForm.dianhuahaoma" 
                placeholder="电话号码" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="校区" prop="xiaoqu">
          <el-input v-model="ruleForm.xiaoqu" 
              placeholder="校区" clearable  :readonly="ro.xiaoqu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="校区" prop="xiaoqu">
              <el-input v-model="ruleForm.xiaoqu" 
                placeholder="校区" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="物品描述" prop="wupinmiaoshu">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="物品描述"
                  v-model="ruleForm.wupinmiaoshu" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.wupinmiaoshu" label="物品描述" prop="wupinmiaoshu">
                    <span>{{ruleForm.wupinmiaoshu}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(238, 233, 207, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"10px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(255, 0, 0, 1)","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(185, 231, 254, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"10px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"6px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(238, 233, 207, 1)","btnSaveBorderWidth":"6px"},
      id: '',
      type: '',
      ro:{
	wupinbianhao : false,
	wupinmingcheng : false,
	wupinleibie : false,
	wupinshuliang : false,
	wupintupian : false,
	diushididian : false,
	shideshijian : false,
	dangqianweizhi : false,
	wupinmiaoshu : false,
	faburenzhanghao : false,
	faburenxingming : false,
	dianhuahaoma : false,
	xiaoqu : false,
      },
      ruleForm: {
        wupinbianhao: this.getUUID(),
        wupinmingcheng: '',
        wupinleibie: '',
        wupinshuliang: '',
        wupintupian: '',
        diushididian: '',
        shideshijian: '',
        dangqianweizhi: '',
        wupinmiaoshu: '',
        faburenzhanghao: '',
        faburenxingming: '',
        dianhuahaoma: '',
        xiaoqu: '',
      },
          wupinleibieOptions: [],
          dangqianweizhiOptions: [],
      rules: {
          wupinbianhao: [
          ],
          wupinmingcheng: [
          ],
          wupinleibie: [
          ],
          wupinshuliang: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          wupintupian: [
          ],
          diushididian: [
          ],
          shideshijian: [
          ],
          dangqianweizhi: [
          ],
          wupinmiaoshu: [
          ],
          faburenzhanghao: [
          ],
          faburenxingming: [
          ],
          dianhuahaoma: [
          ],
          xiaoqu: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='wupinbianhao'){
            this.ruleForm.wupinbianhao = obj[o];
	    this.ro.wupinbianhao = true;
            continue;
          }
          if(o=='wupinmingcheng'){
            this.ruleForm.wupinmingcheng = obj[o];
	    this.ro.wupinmingcheng = true;
            continue;
          }
          if(o=='wupinleibie'){
            this.ruleForm.wupinleibie = obj[o];
	    this.ro.wupinleibie = true;
            continue;
          }
          if(o=='wupinshuliang'){
            this.ruleForm.wupinshuliang = obj[o];
	    this.ro.wupinshuliang = true;
            continue;
          }
          if(o=='wupintupian'){
            this.ruleForm.wupintupian = obj[o];
	    this.ro.wupintupian = true;
            continue;
          }
          if(o=='diushididian'){
            this.ruleForm.diushididian = obj[o];
	    this.ro.diushididian = true;
            continue;
          }
          if(o=='shideshijian'){
            this.ruleForm.shideshijian = obj[o];
	    this.ro.shideshijian = true;
            continue;
          }
          if(o=='dangqianweizhi'){
            this.ruleForm.dangqianweizhi = obj[o];
	    this.ro.dangqianweizhi = true;
            continue;
          }
          if(o=='wupinmiaoshu'){
            this.ruleForm.wupinmiaoshu = obj[o];
	    this.ro.wupinmiaoshu = true;
            continue;
          }
          if(o=='faburenzhanghao'){
            this.ruleForm.faburenzhanghao = obj[o];
	    this.ro.faburenzhanghao = true;
            continue;
          }
          if(o=='faburenxingming'){
            this.ruleForm.faburenxingming = obj[o];
	    this.ro.faburenxingming = true;
            continue;
          }
          if(o=='dianhuahaoma'){
            this.ruleForm.dianhuahaoma = obj[o];
	    this.ro.dianhuahaoma = true;
            continue;
          }
          if(o=='xiaoqu'){
            this.ruleForm.xiaoqu = obj[o];
	    this.ro.xiaoqu = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.faburenzhanghao!=''&&json.faburenzhanghao){
                this.ruleForm.faburenzhanghao = json.faburenzhanghao
	    		this.ro.faburenzhanghao = true;
		}
		if(json.faburenxingming!=''&&json.faburenxingming){
                this.ruleForm.faburenxingming = json.faburenxingming
	    		this.ro.faburenxingming = true;
		}
		if(json.dianhuahaoma!=''&&json.dianhuahaoma){
                this.ruleForm.dianhuahaoma = json.dianhuahaoma
	    		this.ro.dianhuahaoma = true;
		}
		if(json.xiaoqu!=''&&json.xiaoqu){
                this.ruleForm.xiaoqu = json.xiaoqu
	    		this.ro.xiaoqu = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/wupinleibie/leibie`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.wupinleibieOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
            this.dangqianweizhiOptions = "本人代管,拾取处,代收处".split(',')
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `shiwuzhaoling/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {










	if(this.ruleForm.wupintupian!=null) {
		this.ruleForm.wupintupian = this.ruleForm.wupintupian.replace(new RegExp(this.$base.url,"g"),"");
	}

















var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "shiwuzhaoling/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `shiwuzhaoling/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.shiwuzhaolingCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `shiwuzhaoling/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.shiwuzhaolingCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.shiwuzhaolingCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    wupintupianUploadChange(fileUrls) {
	this.ruleForm.wupintupian = fileUrls;
	this.addEditUploadStyleChange()
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
