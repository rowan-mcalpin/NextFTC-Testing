package org.firstinspires.ftc.teamcode

import com.rowanmcalpin.nextftc.command.CommandScheduler
import com.rowanmcalpin.nextftc.command.utility.Delay
import com.rowanmcalpin.nextftc.opmodes.NextFTCOpMode


class TestOpMode: NextFTCOpMode() {

    override fun onInit() {
        CommandScheduler.scheduleCommand(/* Init routine */Delay(1.0))
    }
}