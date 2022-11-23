package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp (group = "TeleOp", name = "servoTest")
public class ServoTest extends OpMode {
    public Servo whiteClaw;
    public Robot robot = new Robot();

    @Override
    public void init() {
        whiteClaw = hardwareMap.get(Servo.class, "whiteClaw");
    }


    @Override
    public void loop() {

//robot.ServoController.pwmEnable();
        double currentPosition = whiteClaw.getPosition();
        telemetry.addData("servoPosition", currentPosition);

      //  telemetry.addData("ServoPort", "Port: " + robot.whiteClaw.getPortNumber());

        if (gamepad2.dpad_up){
            //whiteClaw.setPosition(currentPosition + 0.1);
            robot.openAndCloseClaw(0.0);
        }

        if (gamepad2.dpad_down){
            //whiteClaw.setPosition(currentPosition - 0.1);
            robot.openAndCloseClaw(1.0);
        }

        telemetry.update();

    }
}
