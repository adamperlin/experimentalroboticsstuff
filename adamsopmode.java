
package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.Range;

/**
 * TeleOp Mode
 * <p>
 *Enables control of the robot via the gamepad
 */
public class adamsopmode extends OpMode {







    adamsopmode(){





    }




    private String startDate;
    private ElapsedTime runtime = new ElapsedTime();

    private DcMotorController mydcmotorcontroller;

    private DcMotor mydcmotor;


    /*
     * Code to run when the op mode is first enabled goes here
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
     */
    @Override
    public void init() {
        startDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        runtime.reset();



        mydcmotorcontroller = hardwareMap.dcMotorController.get("drive_controller");

        mydcmotor= hardwareMap.dcMotor.get ("left_drive");









    }

    /*
     * This method will be called repeatedly in a loop
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#loop()
     */
    @Override
    public void loop() {
        telemetry.addData("1 Start", "NullOp started at " + startDate);
        telemetry.addData("2 Status", "running for " + runtime.toString());

        mydcmotor.setPower(1.00);

    }





    @Override
    public void start(){


    }
}
