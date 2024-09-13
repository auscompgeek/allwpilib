// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpiunits/generate_units.py. DO NOT MODIFY

package edu.wpi.first.units.measure;

import static edu.wpi.first.units.Units.*;
import edu.wpi.first.units.*;

@SuppressWarnings({"unchecked", "cast", "checkstyle", "PMD"})
public interface Dimensionless extends Measure<DimensionlessUnit> {
  static  Dimensionless ofRelativeUnits(double magnitude, DimensionlessUnit unit) {
    return new ImmutableDimensionless(magnitude, unit.toBaseUnits(magnitude), unit);
  }

  static  Dimensionless ofBaseUnits(double baseUnitMagnitude, DimensionlessUnit unit) {
    return new ImmutableDimensionless(unit.fromBaseUnits(baseUnitMagnitude), baseUnitMagnitude, unit);
  }

  @Override
  Dimensionless copy();

  @Override
  default MutDimensionless mutableCopy() {
    return new MutDimensionless(magnitude(), baseUnitMagnitude(), unit());
  }

  @Override
  DimensionlessUnit unit();

  @Override
  default DimensionlessUnit baseUnit() { return (DimensionlessUnit) unit().getBaseUnit(); }

  @Override
  default double in(DimensionlessUnit unit) {
    return unit.fromBaseUnits(baseUnitMagnitude());
  }

  @Override
  default Dimensionless unaryMinus() {
    return (Dimensionless) unit().ofBaseUnits(0 - baseUnitMagnitude());
  }

  @Override
  default Dimensionless plus(Measure<? extends DimensionlessUnit> other) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() + other.baseUnitMagnitude());
  }

  @Override
  default Dimensionless minus(Measure<? extends DimensionlessUnit> other) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() - other.baseUnitMagnitude());
  }

  @Override
  default Dimensionless times(double multiplier) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() * multiplier);
  }

  @Override
  default Dimensionless divide(double divisor) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() / divisor);
  }

  @Override
  default Frequency per(TimeUnit period) {
    return divide(period.of(1));
  }


  @Override
  default Mult<DimensionlessUnit, AccelerationUnit<?>> times(Acceleration<?> multiplier) {
    return (Mult<DimensionlessUnit, AccelerationUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, AccelerationUnit<?>> divide(Acceleration<?> divisor) {
    return (Per<DimensionlessUnit, AccelerationUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Angle times(Angle multiplier) {
    return Radians.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngleUnit> divide(Angle divisor) {
    return (Per<DimensionlessUnit, AngleUnit>) Measure.super.divide(divisor);
  }


  @Override
  default AngularAcceleration times(AngularAcceleration multiplier) {
    return RadiansPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularAccelerationUnit> divide(AngularAcceleration divisor) {
    return (Per<DimensionlessUnit, AngularAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default AngularMomentum times(AngularMomentum multiplier) {
    return KilogramMetersSquaredPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularMomentumUnit> divide(AngularMomentum divisor) {
    return (Per<DimensionlessUnit, AngularMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default AngularVelocity times(AngularVelocity multiplier) {
    return RadiansPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularVelocityUnit> divide(AngularVelocity divisor) {
    return (Per<DimensionlessUnit, AngularVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Current times(Current multiplier) {
    return Amps.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, CurrentUnit> divide(Current divisor) {
    return (Per<DimensionlessUnit, CurrentUnit>) Measure.super.divide(divisor);
  }

  @Override
  default Dimensionless divide(Dimensionless divisor) {
    return (Dimensionless) Value.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }

  @Override
  default Dimensionless times(Dimensionless multiplier) {
    return (Dimensionless) Value.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }


  @Override
  default Distance times(Distance multiplier) {
    return Meters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, DistanceUnit> divide(Distance divisor) {
    return (Per<DimensionlessUnit, DistanceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Energy times(Energy multiplier) {
    return Joules.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, EnergyUnit> divide(Energy divisor) {
    return (Per<DimensionlessUnit, EnergyUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Force times(Force multiplier) {
    return Newtons.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, ForceUnit> divide(Force divisor) {
    return (Per<DimensionlessUnit, ForceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Frequency times(Frequency multiplier) {
    return Hertz.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, FrequencyUnit> divide(Frequency divisor) {
    return (Per<DimensionlessUnit, FrequencyUnit>) Measure.super.divide(divisor);
  }


  @Override
  default LinearAcceleration times(LinearAcceleration multiplier) {
    return MetersPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearAccelerationUnit> divide(LinearAcceleration divisor) {
    return (Per<DimensionlessUnit, LinearAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default LinearMomentum times(LinearMomentum multiplier) {
    return KilogramMetersPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearMomentumUnit> divide(LinearMomentum divisor) {
    return (Per<DimensionlessUnit, LinearMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default LinearVelocity times(LinearVelocity multiplier) {
    return MetersPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearVelocityUnit> divide(LinearVelocity divisor) {
    return (Per<DimensionlessUnit, LinearVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mass times(Mass multiplier) {
    return Kilograms.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, MassUnit> divide(Mass divisor) {
    return (Per<DimensionlessUnit, MassUnit>) Measure.super.divide(divisor);
  }


  @Override
  default MomentOfInertia times(MomentOfInertia multiplier) {
    return KilogramSquareMeters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, MomentOfInertiaUnit> divide(MomentOfInertia divisor) {
    return (Per<DimensionlessUnit, MomentOfInertiaUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, MultUnit<?, ?>> times(Mult<?, ?> multiplier) {
    return (Mult<DimensionlessUnit, MultUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, MultUnit<?, ?>> divide(Mult<?, ?> divisor) {
    return (Per<DimensionlessUnit, MultUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, PerUnit<?, ?>> times(Per<?, ?> multiplier) {
    return (Mult<DimensionlessUnit, PerUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, PerUnit<?, ?>> divide(Per<?, ?> divisor) {
    return (Per<DimensionlessUnit, PerUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Power times(Power multiplier) {
    return Watts.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, PowerUnit> divide(Power divisor) {
    return (Per<DimensionlessUnit, PowerUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Temperature times(Temperature multiplier) {
    return Kelvin.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, TemperatureUnit> divide(Temperature divisor) {
    return (Per<DimensionlessUnit, TemperatureUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Time times(Time multiplier) {
    return Seconds.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Frequency divide(Time divisor) {
    return Hertz.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Torque times(Torque multiplier) {
    return NewtonMeters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, TorqueUnit> divide(Torque divisor) {
    return (Per<DimensionlessUnit, TorqueUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, VelocityUnit<?>> times(Velocity<?> multiplier) {
    return (Mult<DimensionlessUnit, VelocityUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, VelocityUnit<?>> divide(Velocity<?> divisor) {
    return (Per<DimensionlessUnit, VelocityUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Voltage times(Voltage multiplier) {
    return Volts.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, VoltageUnit> divide(Voltage divisor) {
    return (Per<DimensionlessUnit, VoltageUnit>) Measure.super.divide(divisor);
  }

}