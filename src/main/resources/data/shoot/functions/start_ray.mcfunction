tag @s add chainray
scoreboard players set #hit chaintemp 0
scoreboard players set #distance chaintemp 0
execute positioned ~ ~1.3 ~ run function shoot:ray
tag @s remove chainray
playsound minecraft:entity.illusioner.mirror_move master @a ~ ~ ~ 1 2
