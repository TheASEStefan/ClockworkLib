package net.asestefan.util_config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;
import java.util.List;

/*
@Author = ASEStefan
 */
public class UtilConfig {
    public static final Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;
    public static final DataGen DATAGEN;
    public static final ForgeConfigSpec DATAGEN_SPEC;


    static {

        Pair<Server, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER = commonSpecPair.getLeft();
        SERVER_SPEC = commonSpecPair.getRight();

        Pair<DataGen , ForgeConfigSpec> commonPair = new ForgeConfigSpec.Builder().configure(DataGen::new);
        DATAGEN = commonPair.getLeft();
        DATAGEN_SPEC = commonPair.getRight();

    }
    public static class Server {

        public final ForgeConfigSpec.ConfigValue<Integer> integer_ex;
        public final ForgeConfigSpec.ConfigValue<Long> long_ex;
        public final ForgeConfigSpec.ConfigValue<Byte> byte_ex;
        public final ForgeConfigSpec.ConfigValue<Double> double_ex;
        public final ForgeConfigSpec.ConfigValue<Boolean> boolean_ex;
        public final ForgeConfigSpec.ConfigValue<List<? extends String>> string_list_ex;


        public Server(ForgeConfigSpec.Builder builder) {
            builder.push("Examples");
            this.integer_ex = builder.comment("Default 3").define("Integer Example",3);
            this.long_ex = builder.comment("Default 20000").define("Long Example", 20000L);
            this.byte_ex = builder.comment("Default 2").define("Byte Example", (byte) 2);
            this.double_ex = builder.comment("Default 0.15").defineInRange("Double Example", 0.15, 0, 1);
            this.boolean_ex = builder.comment("Default true").define("Boolean Example",true);

            // @Disclaimer = To add new elements to the list, put a comma and a " " sign everytime.

            this.string_list_ex = builder.comment("Default minecraft:is_overworld").defineList("String List Example",
                    Lists.newArrayList("minecraft:is_overworld", "") , o -> o instanceof String);
            builder.pop();



        }
    }
    public static class DataGen {

        // public final ForgeConfigSpec.ConfigValue<List<? extends String>> data_etc;

        public DataGen(ForgeConfigSpec.Builder builder) {
            /*
            Same as the server gen.
             */
        }

    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
                .writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}