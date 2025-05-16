package com.project.Models.Map;

import com.google.gson.annotations.SerializedName;
import com.project.Models.Enums.Block;

public class BlockWrapper implements GameObject {
    @SerializedName("block")
    private Block block;

    public BlockWrapper(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String getID() {
        return block.getID();
    }

    @Override
    public String tooString() {
        return block.tooString();
    }
}
