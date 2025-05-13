package com.project.Decorators;

import com.project.Models.Enums.ToolLevel;
import com.project.Models.Tools.Tool;

import static com.project.Models.Enums.ToolLevel.*;

public class ToolDecorator extends Tool {
    Tool tool;

    public ToolDecorator(Tool tool) {
        this.tool = tool;
    }

    public Tool upgrade() {
        ToolLevel level = tool.getLevel();

        switch (level) {
            case Basic:
                tool.setLevel(Cu);
                break;

            case Cu:
                tool.setLevel(Fe);
                break;

            case Fe:
                tool.setLevel(Au);
                break;

            case Au:
                tool.setLevel(Ir);
                break;

            case TrainingFP:
                tool.setLevel(BambooFP);
                break;

            case BambooFP:
                tool.setLevel(FiberGlassFP);
                break;

            case FiberGlassFP:
                tool.setLevel(IrFP);
                break;

            case BasicCan:
                tool.setLevel(CuCan);
                break;

            case CuCan:
                tool.setLevel(FeCan);
                break;

            case FeCan:
                tool.setLevel(AuCan);
                break;

            case AuCan:
                tool.setLevel(IrCan);
                break;

            default:
                break;
        }
        tool.setEnergy(tool.getLevel().getEnergy());

        return tool;
    }
}
