package de.devsnx.statsapi.addon.manager;

import de.devsnx.statsapi.StatsAPI;
import de.devsnx.statsapi.addon.utils.UUIDFetcher;
import de.devsnx.statsapi.addon.StatsAPIAddon;
import de.devsnx.statsapi.manager.other.RankedType;
import me.filoghost.holographicdisplays.api.placeholder.GlobalPlaceholderReplaceFunction;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class PlaceholdersManager {

    public PlaceholdersManager(){
        registerNewPlaceholders();
    }

    private void registerNewPlaceholders(){

        StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi}", 30, new GlobalPlaceholderReplaceFunction() {
            @Override
            public @NotNull String getReplacement(@NotNull String s) {
                return "§4StatsAPI §bv." + StatsAPI.getInstance().getDescription().getVersion() + " §7by §4" + StatsAPI.getInstance().getDescription().getAuthors();
            }
        });

        for(int i = 0; i < 11; i++){
            final int finalI = i;

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_kills}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_deaths}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_wins}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_games}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_openchests}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });


            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_placedblocks}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_breakedblocks}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
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
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_points}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.SKILLPOINTS, finalI) != null){


                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.SKILLPOINTS, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int blocks = StatsAPI.getRankingManager().getValues(RankedType.SKILLPOINTS, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.SKILLPOINTS");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%SKILLPOINTS%", String.valueOf(blocks));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });

            StatsAPIAddon.getApi().registerGlobalPlaceholder("{statsapi-top" + i + "_elo}", 30, new GlobalPlaceholderReplaceFunction() {
                @Override
                public @NotNull String getReplacement(@NotNull String s) {
                    String message = "";
                    if(StatsAPI.getRankingManager().getUUID(RankedType.ELO, finalI) != null){
                        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.ELO, finalI);
                        String playerName = UUIDFetcher.getName(uuid);
                        int blocks = StatsAPI.getRankingManager().getValues(RankedType.ELO, uuid);
                        int rank = finalI;
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.ELO");
                        message = message.replace("%RANK%", String.valueOf(finalI));
                        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
                        message = message.replace("%ELO%", String.valueOf(blocks));
                    }else{
                        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOTAVAILABLE");
                    }
                    return message;
                }
            });
        }
    }
}
