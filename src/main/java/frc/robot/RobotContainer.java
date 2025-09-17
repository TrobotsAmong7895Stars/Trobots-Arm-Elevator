// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ElevatorSubsystem;

import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.Degrees;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ElevatorSubsystem m_exampleSubsystem = new ElevatorSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  
    // Set the default command to force the elevator to go to 0.
    // m_exampleSubsystem.setDefaultCommand(m_exampleSubsystem.setHeight(Meters.of(0)));

      // Set the default command to force the elevator to release.
     m_exampleSubsystem.setDefaultCommand(m_exampleSubsystem.set(0));
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    
    // Schedule `setHeight` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.a().whileTrue(m_exampleSubsystem.setHeight(Meters.of(0.5)));
    m_driverController.b().whileTrue(m_exampleSubsystem.setHeight(Meters.of(1)));
    // Schedule `set` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.x().whileTrue(m_exampleSubsystem.set(0.3));
    m_driverController.y().whileTrue(m_exampleSubsystem.set(-0.3));
    
    /*
    // Schedule `sysId` when the Xbox controller's A button is pressed,
    // cancelling on release.
    m_driverController.a().whileTrue(m_exampleSubsystem.sysId());
    m_driverController.b().whileTrue(m_exampleSubsystem.set(0));
    // Schedule `set` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.x().whileTrue(m_exampleSubsystem.set(0.3));
    m_driverController.y().whileTrue(m_exampleSubsystem.set(-0.3));
    */

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
