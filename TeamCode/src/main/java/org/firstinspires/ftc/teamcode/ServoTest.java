package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (group = "TeleOp", name = "servoTest")
public class ServoTest extends OpMode {
    private Servo whiteClaw;

    @Override
    public void init() {
        whiteClaw = hardwareMap.get(Servo.class, "whiteClaw");
    }

    @Override
    public void loop() {
        double currentPosition = whiteClaw.getPosition();
        telemetry.addData("servoPosition", currentPosition);

        if (gamepad2.dpad_up){
            whiteClaw.setPosition(currentPosition + 0.1);
        }

        if (gamepad2.dpad_down){
            whiteClaw.setPosition(currentPosition - 0.1);
        }

        telemetry.update();

    }
}
