package de.snx.statsapi.addon.manager;

import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.gmail.filoghost.holographicdisplays.api.placeholder.PlaceholderReplacer;
import de.snx.statsapi.StatsAPI;
import de.snx.statsapi.addon.StatsAPIAddon;
import de.snx.statsapi.addon.utils.UUIDFetcher;
import de.snx.statsapi.manager.other.RankedType;

import java.util.UUID;

public class PlaceholdersManager {

    public PlaceholdersManager(){
        registerNewPlaceholders();
    }

    private void registerNewPlaceholders(){
        HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi}", 30, new PlaceholderReplacer() {
            @Override
            public String update() {
                return "§4StatsAPI §bv." + StatsAPI.getInstance().getDescription().getVersion() + " §7by §4Snx";
            }
        });
        for(int i = 0; i < 11; i++){
            final int finalI = i;
            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_kills}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.KILLS, finalI) != null){
                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.KILLS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int kills = StatsAPI.getRankingManager().getValues(RankedType.KILLS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.KILLS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%KILLS%", String.valueOf(kills));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_deaths}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.DEATHS, finalI) != null){
                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.DEATHS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int kills = StatsAPI.getRankingManager().getValues(RankedType.DEATHS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.DEATHS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%DEATHS%", String.valueOf(kills));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_wins}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.WINS, finalI) != null){
                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.WINS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int wins = StatsAPI.getRankingManager().getValues(RankedType.WINS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.WINS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%WINS%", String.valueOf(wins));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_games}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.GAMES, finalI) != null){


                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.GAMES, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int games = StatsAPI.getRankingManager().getValues(RankedType.GAMES, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.GAMES");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%GAMES%", String.valueOf(games));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_openchests}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.OPENCHESTS, finalI) != null){

                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.OPENCHESTS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int openchests = StatsAPI.getRankingManager().getValues(RankedType.OPENCHESTS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.OPENCHESTS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%OPENCHESTS%", String.valueOf(openchests));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_placedblocks}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.PLACEDBLOCKS, finalI) != null){


                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.PLACEDBLOCKS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int blocks = StatsAPI.getRankingManager().getValues(RankedType.PLACEDBLOCKS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.PLACEDBLOCKS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%PLACEDBLOCKS%", String.valueOf(blocks));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });

            HologramsAPI.registerPlaceholder(StatsAPIAddon.getApi(), "{statsapi-top" + i + "_breakedblocks}", 30, new PlaceholderReplacer() {
                @Override
                public String update() {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.BREAKEDBLOCKS, finalI) != null){


                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.BREAKEDBLOCKS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int blocks = StatsAPI.getRankingManager().getValues(RankedType.BREAKEDBLOCKS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.BREAKEDBLOCKS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%BREAKEDBLOCKS%", String.valueOf(blocks));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
                    }
                    return message;
                }
            });
        }
    }
}
