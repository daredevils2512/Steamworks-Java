package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

// import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.ManualSwivel;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
// import com.ctre.phoenix.motorcontrol.can.TalonSRXPIDSetConfiguration;
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

    public void swivel(double speed) {
        shooterSwivel.set(speed);
    }

    public int getSwivelPos() {
        return shooterSwivel.getSelectedSensorPosition();
    }

    public void resetSwivelEncoder() {
        shooterSwivel.setSelectedSensorPosition(0);
    }

    public void spinCycle(Double speed) {
        shooterSpinCycle.set(speed);
    }

    public void bottomBooster(Double speed) {
        shooterBottomBooster.set(speed);
    }

    public void topBooster(Double speed) {
        shooterTopBooster.set(speed);
    }

    public void flywheel(Double speed) {
        shooterFlywheel.set(speed);
    }
    
    //toggle the hood
    public void actuateHood() {
        if(shooterHood.get() == Value.kReverse) {
            shooterHood.set(Value.kForward);
        } else {
            shooterHood.set(Value.kReverse);
        }
    }

    //set to a value    
    public void actuateHood(DoubleSolenoid.Value dir) {
        shooterHood.set(dir);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ManualSwivel());
    }


}