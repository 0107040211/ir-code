package org.usfirst.frc.team449.robot.components;

import edu.wpi.first.wpilibj.AnalogInput;

/**
 * Created by DebkanyaMitra on January 9, 2017.
 */
public class IR extends Component {
    public AnalogInput ir;

    public ir() {
        super();
        ir = new AnalogInput(0);
    }
}