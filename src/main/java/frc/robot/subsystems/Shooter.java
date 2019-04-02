package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRXPIDSetConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Shooter extends Subsystem {

    private WPI_TalonSRX shooterFlywheel = new WPI_TalonSRX(RobotMap.shooterFlywheel);
    
    private WPI_TalonSRX shooterSwivel = new WPI_TalonSRX(RobotMap.shooterTurretSwivel);
    private WPI_TalonSRX shooterBottomBooster = new WPI_TalonSRX(RobotMap.shooterBottomBooster);
    private WPI_TalonSRX shooterTopBooster = new WPI_TalonSRX(RobotMap.shooterTopBooster);
    private WPI_TalonSRX shooterSpinCycle = new WPI_TalonSRX(RobotMap.shooterSpinCycle);

    private DoubleSolenoid shooterHood = new DoubleSolenoid(RobotMap.shooterHoodForward, RobotMap.shooterHoodReverse);

    public Shooter() {
        shooterFlywheel.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
        shooterSwivel.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
    }

    public void swivel(Double speed) {
        
    }

    @Override
    protected void initDefaultCommand() {

    }


}