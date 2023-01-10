package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Autonomous.Falafel;

@Autonomous(group = "Blue", name = "Blue A2 Start (Blue Terminal)")
public class BlueA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        Falafel Falafel = new Falafel();
        MayFlowers MayFlowers = new MayFlowers();
        super.runOpMode();
        robot.startingPosition = "Blue A2";
        sleepTime = 400;

        MayFlowers.initCamera(hardwareMap, telemetry, this);

        while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();
        }

        //Do this to pass inspection.
        waitForStart();

        MayFlowers.AprilTagsUpdate();

        robot.openAndCloseClaw(0);
        sleepTime = 400;
        moveArm("Up", 0.75);
        //moveArmE("Up", 40);
        moveRobotForward(1500, 50);
        moveRobotBackward(300, 50);
        moveRobotLeft(1825, 50);
        sleepTime = (1800);
        moveArm("Up",0.75);
        //moveArmE("Up", 1500);
        moveRobotForward(275, 50);
        robot.openAndCloseClaw(0.3);
        moveRobotBackward(150, 50);
        moveArm("Down",0.75);
        prepareNextAction(100);
        //moveArmE("Down",1500);

        if (robot.parkingZone == 1){

           moveRobotRight(600, 50);

        } else if (robot.parkingZone == 2){

           moveRobotRight(1400, 50);

        } else if (robot.parkingZone == 3){

            moveRobotRight(2400, 50);

        } else {

            moveRobotRight(600, 100);

        }

        /*moveRobotForward(740, 50);
        robot.openAndCloseClaw(0.3);
        moveArmE("Up", 20);

        //Falafel.turnToHeading(0.5, -90);
        turnRobotRight(800,50);
        moveRobotForward(2000,50);
        //Falafel.driveStraight(0.5, 24, 0);
        moveRobotForward(50, 50);
        robot.openAndCloseClaw(0);
        moveRobotBackward(100, 50);

        //Turntable cycling option
        moveTurntable("Left", 600);
        moveRobotBackward(500,50);
        moveArmE("Up", 1000);
        moveRobotLeft(100,50);
        robot.openAndCloseClaw(0.3);
        moveRobotRight(100, 50);
        moveArmE("Down", 1000);
        moveTurntable("Right", 600);


        //Drivetrain turn cycling option
        //Falafel.turnToHeading(0.5,90);
        turnRobotLeft(800,50);
        moveRobotLeft(500, 50);
        moveArmE("Up", 1000);
        moveRobotForward(100, 50);
        robot.openAndCloseClaw(0.3);
        moveRobotBackward(100, 50);
        moveArmE("Down", 1000);
        */
    }
}

