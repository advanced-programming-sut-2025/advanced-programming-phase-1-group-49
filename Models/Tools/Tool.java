package Models.Tools;

import Models.Enums.ToolLevel;

public abstract class Tool {
    ToolLevel level = ToolLevel.basic;

    abstract void decreaseEnergy();

    abstract void toolBehaviour();
}
