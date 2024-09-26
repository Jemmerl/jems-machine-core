package com.jemmerl.jemsmachinecore.test.inventory.container;

import com.jemmerl.jemsmachinecore.core.inventory.container.BaseContainer;
import com.jemmerl.jemsmachinecore.test.init.TestModContainers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestContainer extends BaseContainer {
    public TestContainer(int windowID, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        super(TestModContainers.TEST_CONTAINER, windowID, world, pos, playerInventory, playerEntity);
    }


}
