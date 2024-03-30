const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm753as/",
            name: "ssm753as",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm753as/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序校园失物招领"
        } 
    }
}
export default base
