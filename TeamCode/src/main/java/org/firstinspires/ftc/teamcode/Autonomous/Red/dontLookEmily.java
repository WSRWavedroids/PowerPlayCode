package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

//DON'T LOOK I MEAN IT
@Autonomous(group = "Red", name = "dontLookEmily (Red Terminal)")
public class dontLookEmily extends AutonomousPLUS {













//don't scroll past this point


//STOP!




//Really Don't do it!!












//Please stop
















//pls just stop. like just stop. fr














//This is your last chance


























    //so you decided look even after all of warning, shame on you.





    //Operation, ChaCha slide. :)
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();

        telemetry.addData("Begin Operation", "ChaCha slide");

        //slide to the left

        telemetry.addData("Slide to the", "left");

        moveRobotLeft(960);
        prepareNextAction(200);

//slide to right

        telemetry.addData("Slide to the", "right");

        moveRobotRight(960);
        prepareNextAction(200);

        //Criss cross

        /*telemetry.addData("criss", "cross");

        turnRobotRight(200);
        prepareNextAction(50);
        turnRobotLeft(400);
        prepareNextAction(50);
        turnRobotRight(200);
        prepareNextAction(200);
*/
        //Hop this time

        telemetry.addData("1 hop this","time");
        sleepTime = 400;
        moveArm("Up",.85);
        prepareNextAction(45);
        moveArm("Down", .5);
        prepareNextAction(100);

        //Cha Cha real smooth

        telemetry.addData("Cha Cha", "real smooth");

        moveRobotBackward(200);
        prepareNextAction(50);
        turnRobotRight(200);
        prepareNextAction(25);
        turnRobotLeft(400);
        prepareNextAction(25);
        turnRobotRight(200);
        prepareNextAction(25);
        moveRobotForward(200);
        prepareNextAction(25);

        //Take it back now ya'll

        telemetry.addData("Take it back now","ya'll");

        moveRobotForward(200);
        prepareNextAction(50);
        moveRobotBackward(200);
        prepareNextAction(45);

        //Everybody clap your hands
        telemetry.addData("Everybody", "Clap your hands");
        robot.openAndCloseClaw(0);
        prepareNextAction(10);
        robot.openAndCloseClaw(.3);
        prepareNextAction(45);

    }
}
