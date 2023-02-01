package org.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import org.*;
import org.world.meta.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;


public class OrgBlocks {
  public static Block
    //environment
    calciumOre, carbonFloor, carbonBlock, carbonOre, chitinOre, energiaCrater, 
    energiaPuddle, fleshFloor, fleshBlock, plantFloor, plantBlock, 
    shallowEnergia, deepEnergia, resinFloor, resinBlock, muddySand,
    //decorations
    boulderGreen, boulderRed, boulderBlack, sproutLightgreen, sproutDarkgreen,
    //turrets
    bloodlust, jet, minigun, needle, mender, sower,
    //walls
    carbonWall, carbonWallLarge, chitinWall, chitinWallLarge, resinWall, resinWallLarge,
    //production
    creciteDrill, chinitDrill, resinExtractor,
    //storage
    reservoir,
    //cores
    coreSprout,
    //power
    beamNode, bioBattery, bioGenerator, heatAbsorber, heatConcentrator, powerNode,
    //craft
    bioweaver, energiaCompressor, energiaConverter, phosphorSeparator, vulcanizer,
    //liquid
    barrel, biobridge, bioconduit, liqjunction, peristalsisPump,
    //distribution
    carbonJunction, carbonRouter, overflow, underflow, carbonConveyor, carbonBridge,
    //effect
    flash, trap,
    //units
    nestRecT1, nestRecT2, nestRecT3;
  
  
  
  public static void load() {
    
    calciumOre = new OreBlock(OrgItems.calcium);
    
    carbonOre = new OreBlock(OrgItems.carbon);
    
    chitinOre = new OreBlock(OrgItems.chitin);
    
    carbonFloor = new Floor("carbon-floor") {{
      itemDrop = OrgItems.carbon;
    }};
    
    carbonBlock = new StaticWall("carbon-block") {{
      carbonFloor.asFloor().wall = this;
    }};
    
    energiaCrater = new Floor("energia-crater") {{
      attributes.set(Attribute.heat, 1f);
      emitLight = true;
      lightRadius = 50f;
      lightColor = Color.orange.cpy().a(0.3f);
    }};
    
    energiaPuddle = new Floor("energia-puddle") {{
      attributes.set(Attribute.heat, 0.75f);
      emitLight = true;
      lightRadius = 30f;
      lightColor = Color.orange.cpy().a(0.15f);
    }};
      
    fleshFloor = new Floor("flesh-floor");
    
    fleshBlock = new StaticWall("flesh-block") {{
      fleshFloor.asFloor().wall = energiaPuddle.asFloor().wall = energiaCrater.asFloor().wall = this;
    }};
    
    plantFloor = new Floor("plant-floor");
    
    plantBlock = new StaticWall("plant-block") {{
      plantFloor.asFloor().wall = this;
    }};
    
    shallowEnergia = new Floor("shallow-energia") {{
      speedMultiplier = 0.75f;
      variants = 0;
      albedo = 0.9f;
      isLiquid = true;
      liquidDrop = OrgLiquids.energia;
      cacheLayer = CacheLayer.water;
      supportsOverlay = true;
    }};
    
    deepEnergia = new Floor("deep-energia") {{
      speedMultiplier = 0.25f;
      variants = 0;
      liquidMultiplier = 1.5f;
      albedo = 0.9f;
      drownTime = 300f;
      isLiquid = true;
      liquidDrop = OrgLiquids.energia;
      cacheLayer = CacheLayer.water;
      supportsOverlay = true;
    }};
    
    resinFloor = new Floor("resin-floor") {{
      speedMultiplier = 0.2f;
      attributes.set(OrgAttribute.resin, 0.75f);
      attributes.set(Attribute.water, -0.25f);
    }};
    
    resinBlock = new StaticWall("resin-block") {{
      resinFloor.asFloor().wall = this;
    }};
    
    muddySand = new Floor("muddy-sand") {{
      speedMultiplier = 0.2f;
      itemDrop = Items.sand;
      playerUnmineable = true;
      attributes.set(OrgAttribute.resin, 0.15f);
      attributes.set(Attribute.water, 0.75f);
    }};
  }
}
