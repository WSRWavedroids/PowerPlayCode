package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Blue", name = "Blue A3 Start (Red Terminal)")
public class BlueA3Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();

        moveArmE("Up", 15);
        sleep(2000);


    }
}

//blue a2 and red a5 zone 2 on medium pole and zone 3 small pole idk arm values
//red a2 blue a5 opposite

