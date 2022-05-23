package com.colbaltstudios.randcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class SyithianAlter extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6.5, 9.5, 5.5, 10.5, 11.5, 6.5),
            Block.makeCuboidShape(30, 16.844326232539018, 9.665800217640127, 31, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(21, 12.880082063713186, -7.804156904319218, 22, 13.880082063713186, -6.804156904319218),
            Block.makeCuboidShape(21, 16.844326232539018, 25.66580021764012, 22, 17.844326232539018, 26.66580021764012),
            Block.makeCuboidShape(0, 9.844326232539018, -9.334199782359876, 1, 10.844326232539018, -8.334199782359871),
            Block.makeCuboidShape(-16, 16.844326232539018, 9.665800217640127, -15, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(11, 18.844326232539018, 11.665800217640118, 12, 19.844326232539018, 12.665800217640118),
            Block.makeCuboidShape(0, 24.844326232539018, 19.665800217640125, 1, 25.844326232539018, 20.665800217640125),
            Block.makeCuboidShape(17, -3.1199179362868144, -7.804156904319218, 18, -2.1199179362868144, -6.804156904319218),
            Block.makeCuboidShape(0, 24.844326232539018, 1.6658002176401272, 1, 25.844326232539018, 2.665800217640127),
            Block.makeCuboidShape(0, 17.013783038796554, 24.33215294296123, 1, 18.013783038796554, 25.332152942961223),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 1, 0, 2, 17, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 17, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 17, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 17, 2),
            Block.makeCuboidShape(2, 1, 2, 14, 10, 14),
            Block.makeCuboidShape(14, 1, 2, 19, 2, 14),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 18),
            Block.makeCuboidShape(-3, 1, 2, 2, 2, 14),
            Block.makeCuboidShape(14, 10, 2, 19, 11, 14),
            Block.makeCuboidShape(2, 0.9015128547956879, -2.5771467909299197, 14, 1.9015128547956879, 2.4228532090700803),
            Block.makeCuboidShape(-3, 10, 2, 2, 11, 14),
            Block.makeCuboidShape(2, 4, 13, 14, 5, 18),
            Block.makeCuboidShape(2, 10.098487145204313, -2.5771467909299197, 14, 11.098487145204313, 2.4228532090700803),
            Block.makeCuboidShape(-1, 17, -1, 3, 18, 3),
            Block.makeCuboidShape(13, 17, -1, 17, 18, 3),
            Block.makeCuboidShape(13, 17, 13, 17, 18, 17),
            Block.makeCuboidShape(-1, 17, 13, 3, 18, 17),
            Block.makeCuboidShape(6.5, 10, 6.5, 10.5, 10, 10.5),
            Block.makeCuboidShape(10.5, 9.5, 6.5, 11.5, 11.5, 10.5),
            Block.makeCuboidShape(5.5, 9.5, 6.5, 6.5, 11.5, 10.5),
            Block.makeCuboidShape(6.5, 9.5, 10.5, 10.5, 11.5, 11.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(6.5, 9.5, 5.5, 10.5, 11.5, 6.5),
            Block.makeCuboidShape(30, 16.844326232539018, 9.665800217640127, 31, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(21, 12.880082063713186, -7.804156904319218, 22, 13.880082063713186, -6.804156904319218),
            Block.makeCuboidShape(21, 16.844326232539018, 25.66580021764012, 22, 17.844326232539018, 26.66580021764012),
            Block.makeCuboidShape(0, 9.844326232539018, -9.334199782359876, 1, 10.844326232539018, -8.334199782359871),
            Block.makeCuboidShape(-16, 16.844326232539018, 9.665800217640127, -15, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(11, 18.844326232539018, 11.665800217640118, 12, 19.844326232539018, 12.665800217640118),
            Block.makeCuboidShape(0, 24.844326232539018, 19.665800217640125, 1, 25.844326232539018, 20.665800217640125),
            Block.makeCuboidShape(17, -3.1199179362868144, -7.804156904319218, 18, -2.1199179362868144, -6.804156904319218),
            Block.makeCuboidShape(0, 24.844326232539018, 1.6658002176401272, 1, 25.844326232539018, 2.665800217640127),
            Block.makeCuboidShape(0, 17.013783038796554, 24.33215294296123, 1, 18.013783038796554, 25.332152942961223),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 1, 0, 2, 17, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 17, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 17, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 17, 2),
            Block.makeCuboidShape(2, 1, 2, 14, 10, 14),
            Block.makeCuboidShape(14, 1, 2, 19, 2, 14),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 18),
            Block.makeCuboidShape(-3, 1, 2, 2, 2, 14),
            Block.makeCuboidShape(14, 10, 2, 19, 11, 14),
            Block.makeCuboidShape(2, 0.9015128547956879, -2.5771467909299197, 14, 1.9015128547956879, 2.4228532090700803),
            Block.makeCuboidShape(-3, 10, 2, 2, 11, 14),
            Block.makeCuboidShape(2, 4, 13, 14, 5, 18),
            Block.makeCuboidShape(2, 10.098487145204313, -2.5771467909299197, 14, 11.098487145204313, 2.4228532090700803),
            Block.makeCuboidShape(-1, 17, -1, 3, 18, 3),
            Block.makeCuboidShape(13, 17, -1, 17, 18, 3),
            Block.makeCuboidShape(13, 17, 13, 17, 18, 17),
            Block.makeCuboidShape(-1, 17, 13, 3, 18, 17),
            Block.makeCuboidShape(6.5, 10, 6.5, 10.5, 10, 10.5),
            Block.makeCuboidShape(10.5, 9.5, 6.5, 11.5, 11.5, 10.5),
            Block.makeCuboidShape(5.5, 9.5, 6.5, 6.5, 11.5, 10.5),
            Block.makeCuboidShape(6.5, 9.5, 10.5, 10.5, 11.5, 11.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(6.5, 9.5, 5.5, 10.5, 11.5, 6.5),
            Block.makeCuboidShape(30, 16.844326232539018, 9.665800217640127, 31, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(21, 12.880082063713186, -7.804156904319218, 22, 13.880082063713186, -6.804156904319218),
            Block.makeCuboidShape(21, 16.844326232539018, 25.66580021764012, 22, 17.844326232539018, 26.66580021764012),
            Block.makeCuboidShape(0, 9.844326232539018, -9.334199782359876, 1, 10.844326232539018, -8.334199782359871),
            Block.makeCuboidShape(-16, 16.844326232539018, 9.665800217640127, -15, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(11, 18.844326232539018, 11.665800217640118, 12, 19.844326232539018, 12.665800217640118),
            Block.makeCuboidShape(0, 24.844326232539018, 19.665800217640125, 1, 25.844326232539018, 20.665800217640125),
            Block.makeCuboidShape(17, -3.1199179362868144, -7.804156904319218, 18, -2.1199179362868144, -6.804156904319218),
            Block.makeCuboidShape(0, 24.844326232539018, 1.6658002176401272, 1, 25.844326232539018, 2.665800217640127),
            Block.makeCuboidShape(0, 17.013783038796554, 24.33215294296123, 1, 18.013783038796554, 25.332152942961223),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 1, 0, 2, 17, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 17, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 17, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 17, 2),
            Block.makeCuboidShape(2, 1, 2, 14, 10, 14),
            Block.makeCuboidShape(14, 1, 2, 19, 2, 14),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 18),
            Block.makeCuboidShape(-3, 1, 2, 2, 2, 14),
            Block.makeCuboidShape(14, 10, 2, 19, 11, 14),
            Block.makeCuboidShape(2, 0.9015128547956879, -2.5771467909299197, 14, 1.9015128547956879, 2.4228532090700803),
            Block.makeCuboidShape(-3, 10, 2, 2, 11, 14),
            Block.makeCuboidShape(2, 4, 13, 14, 5, 18),
            Block.makeCuboidShape(2, 10.098487145204313, -2.5771467909299197, 14, 11.098487145204313, 2.4228532090700803),
            Block.makeCuboidShape(-1, 17, -1, 3, 18, 3),
            Block.makeCuboidShape(13, 17, -1, 17, 18, 3),
            Block.makeCuboidShape(13, 17, 13, 17, 18, 17),
            Block.makeCuboidShape(-1, 17, 13, 3, 18, 17),
            Block.makeCuboidShape(6.5, 10, 6.5, 10.5, 10, 10.5),
            Block.makeCuboidShape(10.5, 9.5, 6.5, 11.5, 11.5, 10.5),
            Block.makeCuboidShape(5.5, 9.5, 6.5, 6.5, 11.5, 10.5),
            Block.makeCuboidShape(6.5, 9.5, 10.5, 10.5, 11.5, 11.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6.5, 9.5, 5.5, 10.5, 11.5, 6.5),
            Block.makeCuboidShape(30, 16.844326232539018, 9.665800217640127, 31, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(21, 12.880082063713186, -7.804156904319218, 22, 13.880082063713186, -6.804156904319218),
            Block.makeCuboidShape(21, 16.844326232539018, 25.66580021764012, 22, 17.844326232539018, 26.66580021764012),
            Block.makeCuboidShape(0, 9.844326232539018, -9.334199782359876, 1, 10.844326232539018, -8.334199782359871),
            Block.makeCuboidShape(-16, 16.844326232539018, 9.665800217640127, -15, 17.844326232539018, 10.665800217640127),
            Block.makeCuboidShape(11, 18.844326232539018, 11.665800217640118, 12, 19.844326232539018, 12.665800217640118),
            Block.makeCuboidShape(0, 24.844326232539018, 19.665800217640125, 1, 25.844326232539018, 20.665800217640125),
            Block.makeCuboidShape(17, -3.1199179362868144, -7.804156904319218, 18, -2.1199179362868144, -6.804156904319218),
            Block.makeCuboidShape(0, 24.844326232539018, 1.6658002176401272, 1, 25.844326232539018, 2.665800217640127),
            Block.makeCuboidShape(0, 17.013783038796554, 24.33215294296123, 1, 18.013783038796554, 25.332152942961223),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 1, 0, 2, 17, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 17, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 17, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 17, 2),
            Block.makeCuboidShape(2, 1, 2, 14, 10, 14),
            Block.makeCuboidShape(14, 1, 2, 19, 2, 14),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 18),
            Block.makeCuboidShape(-3, 1, 2, 2, 2, 14),
            Block.makeCuboidShape(14, 10, 2, 19, 11, 14),
            Block.makeCuboidShape(2, 0.9015128547956879, -2.5771467909299197, 14, 1.9015128547956879, 2.4228532090700803),
            Block.makeCuboidShape(-3, 10, 2, 2, 11, 14),
            Block.makeCuboidShape(2, 4, 13, 14, 5, 18),
            Block.makeCuboidShape(2, 10.098487145204313, -2.5771467909299197, 14, 11.098487145204313, 2.4228532090700803),
            Block.makeCuboidShape(-1, 17, -1, 3, 18, 3),
            Block.makeCuboidShape(13, 17, -1, 17, 18, 3),
            Block.makeCuboidShape(13, 17, 13, 17, 18, 17),
            Block.makeCuboidShape(-1, 17, 13, 3, 18, 17),
            Block.makeCuboidShape(6.5, 10, 6.5, 10.5, 10, 10.5),
            Block.makeCuboidShape(10.5, 9.5, 6.5, 11.5, 11.5, 10.5),
            Block.makeCuboidShape(5.5, 9.5, 6.5, 6.5, 11.5, 10.5),
            Block.makeCuboidShape(6.5, 9.5, 10.5, 10.5, 11.5, 11.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    public SyithianAlter(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {

            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            case SOUTH:
                return SHAPE_S;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
      return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}
