package org.firstinspires.ftc.teamcode.Autonomous;
//DON'T LOOK I MEAN IT
public class dontLookEmily extends AutonomousPLUS {













//don't scroll past this point


//STOP!




//Really Don't do it!!












//Please stop
















//pls just stop. like just stop. fr














//This is your last chance


























    //so you decided look even after all of warning, shame on you.


    //Operation, ChaCha slide.
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();

        telemetry.addData("Begin Operation", "ChaCha slide");

        //slide to the left

        telemetry.addData("Slide to the", "left");

        moveRobotLeft(960,200);

//slide to right

        telemetry.addData("Slide to the", "right");

        moveRobotRight(960,200);

        //Criss cross

        telemetry.addData("criss", "cross");

        turnRobotRight(200,50);
        turnRobotLeft(400,50);
        turnRobotRight(200,200);

        //Hop this time

        telemetry.addData("1 hop this","time");

        moveArm("up",.25);
        prepareNextAction(200);
        moveArm("down", .15);

        //Cha Cha real smooth

        telemetry.addData("Cha Cha", "real smooth");

        moveRobotBackward(200,50);
        turnRobotRight(200,50);
        turnRobotLeft(400,50);
        turnRobotRight(200,50);
        moveRobotForward(200,50);

        //Take it back now ya'll

        telemetry.addData("Take it back now","ya'll");

        moveRobotBackward(200,50);


    }
}
