import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyTest {

    //$2a$10$.fNiFRZLUBEI1gVkB.ZGdO1nHtlQ/VdCuEG9PX11cOtm9HqmhvnWu
    //$2a$10$UQKFXB6LBMqJ1/fpHrDMPeKwJSz4DNIHNB034ds2wEm5FxHVfsuWS
    //$2a$10$0H/HwJxcee2A5Vp0av1yMenpGSGMjcsbUfD2B6/iq2mj1v9h0tQeq
    //相同数据每次加密结果不一致
    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        System.out.println(passwordEncoder.encode("123456"));

    }

}
