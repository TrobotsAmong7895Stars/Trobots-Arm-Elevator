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
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */
<<<<<<< HEAD
  public static Command exampleAuto(ElevatorSubsystem subsystem) {
    return null;
=======
  public static Command exampleAuto(ArmSubsystem subsystem) {
    return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));
>>>>>>> Trobots-Arm/main
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
