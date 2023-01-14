package org.firstinspires.ftc.teamcode.Autonomous;
/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Robot;
import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;


/**
 * This is the autonomous mode. It moves the robot without us having to touch the controller.
 * Previous programmers really sucked at explaining what any of this meant, so we're trying to do better.
 */

public class AutonomousPLUS extends LinearOpMode {

    // This section tells the program all of the different pieces of hardware that are on our robot that we will use in the program.
    private ElapsedTime runtime = new ElapsedTime();

    public double speed = 0.4;
    public int sleepTime;

    //DO NOT DELETE THIS LINE! CAPITALIZATION IS VERY IMPORTANT!!!
    public Robot robot = new Robot();
    public MayFlowers MayFlowers = new MayFlowers();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap, telemetry, this);
        robot.encoderReset();
        robot.encoderRunningMode();
    }

    public void makeItWork(HardwareMap hardwareMap, Telemetry telemetry) {
        robot.init(hardwareMap, telemetry, this);
    }

    //I think the setTargets Function is broken. Motors don't stop at the right place
    public void moveRobotForward(int ticks, long pause) {
        if (opModeIsActive()) {
            robot.setTargets("Backward", ticks);
            robot.positionRunningMode();
        }
        robot.powerSet(speed);

        while (opModeIsActive() && robot.isWheelsBusy()) {
            robot.tellMotorOutput();
        }

        robot.stopAllMotors();
        robot.encoderRunningMode();
        robot.stopAllMotors();
        sleep(pause);
        robot.encoderReset();
    }

    public void moveRobotBackward(int ticks, long pause) {
        if (opModeIsActive()) {
            robot.setTargets("Forward", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() && robot.isWheelsBusy()) {
                robot.tellMotorOutput();
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
            sleep(pause);
            robot.encoderReset();
        }

    }

    public void moveRobotLeft(int ticks, long pause) {

        if (opModeIsActive()) {
            robot.setTargets("Right", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() && robot.isWheelsBusy()) {
                robot.tellMotorOutput();
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
            sleep(pause);
            robot.encoderReset();
        }
    }

    public void moveRobotRight(int ticks, long pause) {

        if (opModeIsActive()) {
            robot.setTargets("Left", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() && robot.isWheelsBusy()) {
                robot.tellMotorOutput();
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
            sleep(pause);
            robot.encoderReset();
        }
    }

    public void turnRobotRight(int ticks, long pause) {

        if (opModeIsActive()) {
            robot.setTargets("Turn Right", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() && robot.isWheelsBusy()) {
                robot.tellMotorOutput();
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
            sleep(pause);
            robot.encoderReset();
        }
    }

    public void turnRobotLeft(int ticks, long pause) {

        if (opModeIsActive()) {
            robot.setTargets("Turn Left", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() && robot.isWheelsBusy()) {
                robot.tellMotorOutput();
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
            sleep(pause);
            robot.encoderReset();

        }
    }

    public void prepareNextAction(long pause) {
        sleep(pause);
        robot.encoderReset();
    }

    public void moveArm(String direction, double power) {
        if (direction == "Up") {
            robot.slide.setDirection(DcMotor.Direction.REVERSE);
            robot.slide.setPower(0.75);
            sleep(sleepTime);
            robot.slide.setPower(0.1);
            sleep(1550);
        } else if (direction == "Down") {
            robot.slide.setDirection(DcMotor.Direction.FORWARD);
            robot.slide.setPower(0.5);
        }
    }

    public void moveArmE(String direction, int distance) {
        robot.slide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        if (direction == "Up") {
            //robot.slide.setDirection(DcMotor.Direction.REVERSE);
            if (opModeIsActive()) {
                robot.slide.setTargetPosition(-distance + Math.abs(robot.slide.getCurrentPosition()));
                robot.slide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                robot.slide.setPower(0.75);

                while (opModeIsActive()) {
                    robot.tellMotorOutput();
                    telemetry.addData("Arm", "Arm is climbing");
                    telemetry.update();

                    if (Math.abs(robot.slide.getCurrentPosition()) == Math.abs(robot.slide.getTargetPosition())) {
                        break;
                    }

                }
                robot.slide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                telemetry.addData("Arm", "Arm has peaked!");
                telemetry.update();
            }
            robot.slide.setPower(0.1);
            telemetry.addData("Arm", "Arm has reached the pinnacle");
            telemetry.update();

        } else if (direction == "Down") {
            robot.slide.setDirection(DcMotor.Direction.FORWARD);
            if (opModeIsActive()) {
                robot.setTargets("Arm", distance);
                robot.slide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                robot.slide.setPower(0.5);

                while (opModeIsActive() && robot.slide.isBusy()) {
                    robot.tellMotorOutput();
                }

                robot.slide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            }
            robot.slide.setPower(0.1);
        }

        robot.slide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        telemetry.addData("Arm", "Arm is reset");
        telemetry.update();

    }

    public void moveTurntable(String direction, int distance) {

        if (direction == "Left") {
            robot.turntable.setDirection(DcMotor.Direction.FORWARD); //Check on this...

        } else if (direction == "Right") {
            robot.turntable.setDirection(DcMotor.Direction.REVERSE); //Check on this...
        }

        if (opModeIsActive()) {
            robot.setTargets("Turntable", distance);
            robot.turntable.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.powerSet(0.45);

            while (opModeIsActive() && robot.turntable.isBusy()) {
                robot.tellMotorOutput();
            }

            robot.turntable.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        robot.turntable.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
}