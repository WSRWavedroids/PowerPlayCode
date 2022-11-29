package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Robot;


@Autonomous(group = "Blue", name = "Blue A5 Start (Red Terminal)")
public class BlueA5Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
//Gameplan is to put a cone in ground junction then parking in a space
        //Do this to pass inspection.
        waitForStart();
        moveToParkingZone("Blue A5");
//Changed ticks 1000 to 960
        //moveRobotLeft(960);
      //  prepareNextAction(400);
//Changed ticks 3000 to 960
        //moveRobotForward(1500);
        //prepareNextAction(500);

    }
}

