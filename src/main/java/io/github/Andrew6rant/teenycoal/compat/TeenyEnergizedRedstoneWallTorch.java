package io.github.Andrew6rant.teenycoal.compat;

import io.github.Andrew6rant.teenycoal.block.TeenyRedstoneWallTorch;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class TeenyEnergizedRedstoneWallTorch extends TeenyRedstoneWallTorch {
    public TeenyEnergizedRedstoneWallTorch(Settings settings) {
        super(settings);
    }
    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(LIT) && Direction.UP != direction ? 15 : 0;
    }
}
