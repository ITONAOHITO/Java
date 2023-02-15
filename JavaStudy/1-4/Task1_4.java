public class Task1_4{

    private static final String USER_NAME = "aiueo";
    private static final String USER_PASSWORD = "kakikukeko";
    
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args) {
        String name = "aiueo";
        String pass = "alice123";

        if (USER_NAME == name && USER_PASSWORD == pass) {
            System.out.println(CONST_MSG_SUCCESS);
        }   else if (USER_NAME == name) {
            System.out.println(CONST_MSG_ERROR_PASS);
        }   else if (USER_PASSWORD == pass) {
            System.out.println(CONST_MSG_ERROR_NAME);
        }   else {
            System.out.println(CONST_MSG_ERROR_INPUT);
        }
    }

}