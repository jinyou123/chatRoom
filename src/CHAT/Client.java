package CHAT;

    //聊天室客户端
    public class Client {
        //主方法:启动登录线程
        public static void main(String[] args) {
            Thread login = new LoginThread();
            login.start();
        }
}
