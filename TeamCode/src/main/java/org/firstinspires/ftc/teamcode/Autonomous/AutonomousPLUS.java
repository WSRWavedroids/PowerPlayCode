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
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.AprilTagDetectionPipeline;
import org.firstinspires.ftc.teamcode.Robot;
import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;


/**
 * This is the autonomous mode. It moves the robot without us having to touch the controller.
 * Previous programmers really sucked at explaining what any of this meant, so we're trying to do better.
 */

//todo Create function to convert tick values based on speed.
public class AutonomousPLUS extends LinearOpMode {

    // This section tells the program all of the different pieces of hardware that are on our robot that we will use in the program.
    private ElapsedTime runtime = new ElapsedTime();

    public double speed = 0.4;
    public String startingPosition;


    //DO NOT DELETE THIS LINE! CAPITALIZATION IS VERY IMPORTANT!!!
    public Robot robot = new Robot();
    public MayFlowers MayFlowers = new MayFlowers();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap, telemetry, this);
        robot.encoderReset();
        robot.encoderRunningMode();

    }

    //I think the setTargets Function is broken. Motors don't stop at the right place
    public void moveRobotForward(int ticks) {
        if (opModeIsActive()){
            robot.setTargets("Forward", ticks);
            robot.positionRunningMode();
        }
        robot.powerSet(speed);

        while (opModeIsActive() &&
                robot.isWheelsBusy()) {
            robot.tellMotorOutput();
            //nothings here
        }

        robot.stopAllMotors();
        robot.encoderRunningMode();
        robot.stopAllMotors();
    }


    public void moveRobotBackward(int ticks){
        if (opModeIsActive()){
            robot.setTargets("Backward", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() &&
                    robot.isWheelsBusy()) {
                robot.tellMotorOutput();
                //nothings here
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
        }

    }
    public void moveRobotLeft(int ticks) {

        if (opModeIsActive()){
            robot.setTargets("Left", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() &&
                    robot.isWheelsBusy()) {
                robot.tellMotorOutput();
                //nothings here
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
        }
    }

    public void moveRobotRight(int ticks) {

        if (opModeIsActive()) {
            robot.setTargets("Right", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() &&
                    robot.isWheelsBusy()) {
                robot.tellMotorOutput();
                //nothings here
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
        }
    }

    public void turnRobotRight(int ticks) {

        if (opModeIsActive()) {
            robot.setTargets("Turn Right", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() &&
                    robot.isWheelsBusy()) {
                robot.tellMotorOutput();
                //nothings here
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
        }
    }

    public void turnRobotLeft(int ticks) {

        if (opModeIsActive()) {
            robot.setTargets("Turn Left", ticks);
            robot.positionRunningMode();
            robot.powerSet(speed);

            while (opModeIsActive() &&
                    robot.isWheelsBusy()) {
                robot.tellMotorOutput();
                //nothings here
            }

            robot.stopAllMotors();
            robot.encoderRunningMode();
        }

    }


    public void prepareNextAction(long pause){
        sleep(pause);
        robot.encoderReset();
    }

    public void moveArm(String direction, double power){
        if (direction == "Up"){
            robot.slide.setDirection(DcMotor.Direction.REVERSE);
            robot.slide.setPower(0.75);
        } else if (direction == "Down"){
            robot.slide.setDirection(DcMotor.Direction.FORWARD);
            robot.slide.setPower(0.25);
        }
    }

    public void moveToParkingZone(){

        if (robot.parkingZone == 1){

            moveRobotLeft(2000);
            prepareNextAction(200);
            moveRobotForward(3000);
            prepareNextAction(200);

        } else if (robot.parkingZone == 2){

            moveRobotForward(2000);
            prepareNextAction(200);

        } else if (robot.parkingZone == 3){

            moveRobotRight(2000);
            prepareNextAction(200);
            moveRobotForward(3000);
            prepareNextAction(200);
        }


    }

    public void identifyAprilTags(){
        //MayFlowers.findAprilTags();
    }

    public void placeHighCone(){

        if(startingPosition == "Blue A2" || startingPosition == "Red A5") {

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotLeft(1550);
            prepareNextAction(100);
            moveArm("Up", 0.75);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down", 0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);

        } else if(startingPosition == "Blue A5" || startingPosition == "Red A2"){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotRight(1550);
            prepareNextAction(100);
            moveArm("up",0.75);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);

        }
    }

}


