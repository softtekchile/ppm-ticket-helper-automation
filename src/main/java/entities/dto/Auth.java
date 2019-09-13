package entities.dto;

public class Auth {
    private String mail;
    private String encryptedPw;
    private String pw;


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEncryptedPw() {
        return encryptedPw;
    }

    public void setEncryptedPw(String encryptedPw) {
        this.encryptedPw = encryptedPw;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "mail='" + mail + '\'' +
                ", encryptedPw='" + encryptedPw + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
