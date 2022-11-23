package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad2;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode; // added by JJR. for servo testing
import com.qualcomm.robotcore.hardware.Servo; // added by JJR. for servo testing
import com.qualcomm.robotcore.hardware.CRServo; // added by JJR. for servo testing
import com.qualcomm.robotcore.util.Range; // added by JJR. for servo testing

@TeleOp(name="Drive Gripper" , group="Exercises")
public abstract class ServoTesting extends OpMode {

    DcMotor leftMotor, rightMotor;
    Servo armServo, gripServo;
    CRServo contServo;
    float leftY, rightY;
    double armPosition, gripPosition, contPower;
    double MIN_POSITION = 0, MAX_POSITION = 1;

    // CALLED WHEN INT BUTTON IS PRESSED.
    //@Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_Motor");
        rightMotor = hardwareMap.dcMotor.get("right_Motor");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);

        armServo = hardwareMap.servo.get("whiteClaw");
        gripServo = hardwareMap.servo.get("grip_servo");
        contServo = (CRServo) hardwareMap.servo.get("cont_servo");

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        // wait for start button.

        //waitForStart();

        double armPosition = .5;
        gripPosition = MAX_POSITION;

        //while (opModeIsActive()) {
            leftY = gamepad2.left_stick_y * -1;
            rightY = gamepad2.right_stick_y * -1;

            leftMotor.setPower(Range.clip(leftY, -1.0, 1.0));
            rightMotor.setPower(Range.clip(rightY, -1.0, 1.0));

            telemetry.addData("Mode", "running");
            telemetry.addData("sticks", " left=" + leftY + " right=" + rightY);

            // check the gamepad buttons and if pressed, increment the appropriate position
            // variable to change the servo location.

            // move arm down A button if not already at lowest position./
            if (gamepad2.a && armPosition > MIN_POSITION) armPosition -= .01;

            // move arm down B button if not already at highest position.
            if (gamepad2.b && armPosition < MAX_POSITION) armPosition += .01;

            // open the gripper on X button if not already at most open position.
            if (gamepad2.x && gripPosition < MAX_POSITION) gripPosition = gripPosition + .01;

            // close the gripper on X button if not already at most closed position.
            if (gamepad2.y && gripPosition > MIN_POSITION) gripPosition = gripPosition - .01;

            // Set continuous servo power level and direction.
            if (gamepad2.dpad_left)
                contPower = -.20;
            else if (gamepad2.dpad_right)
                contPower = -.20;
            else
                contPower = 0.0;
            // set the servo position/power values as we have comuted them.


        //}
    }


}

