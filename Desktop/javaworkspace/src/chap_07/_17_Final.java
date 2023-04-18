package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final : 상속 불가하게 막음 (클래스, 변수, 메소드 앞 작성 가능)

        //public (final) class...
        //public (final) void...
        //public > abstract > static > final >....

        ActionCam actionCam = new ActionCam();
        //actionCam.lens="표준렌즈"; //변수에 final 작성해서 변경 불가
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("==============");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();//액션캠클래스의 메소드 호출


    }
}
