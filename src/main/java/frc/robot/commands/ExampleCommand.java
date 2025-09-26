// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

<<<<<<< HEAD
import frc.robot.subsystems.ElevatorSubsystem;
=======
import frc.robot.subsystems.ArmSubsystem;
>>>>>>> Trobots-Arm/main
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
<<<<<<< HEAD
  private final ElevatorSubsystem m_subsystem;
=======
  private final ArmSubsystem m_subsystem;
>>>>>>> Trobots-Arm/main

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
<<<<<<< HEAD
  public ExampleCommand(ElevatorSubsystem subsystem) {
=======
  public ExampleCommand(ArmSubsystem subsystem) {
>>>>>>> Trobots-Arm/main
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
