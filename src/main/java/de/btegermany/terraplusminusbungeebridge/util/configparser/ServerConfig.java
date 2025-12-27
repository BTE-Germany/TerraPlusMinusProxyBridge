package de.btegermany.terraplusminusbungeebridge.util.configparser;

import java.util.List;

public class ServerConfig {

    public ServerConfig(){

    }
    public ServerConfig(List<Server> servers){
        this.servers = servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }
    private List<Server> servers;


    public List<Server> getServers() {
        return servers;
    }

    public static class Server {

        public Server(){

        }

        public Server(String name, int xOffset, int yOffset, int zOffset, int maxMcBuildHeight, int overlappingPlus, int overlappingMinus, int minLatitudeMC, int maxLatitudeMC, int minLongitudeMC, int maxLongitudeMC, boolean newHighLimit){
            this.name = name;
            this.xOffset = xOffset;
            this.yOffset = yOffset;
            this.zOffset = zOffset;
            this.maxMcBuildHeight = maxMcBuildHeight;
            this.overlappingPlus = overlappingPlus;
            this.overlappingMinus = overlappingMinus;
            this.minLatitudeMC = minLatitudeMC;
            this.maxLatitudeMC = maxLatitudeMC;
            this.minLongitudeMC = minLongitudeMC;
            this.maxLongitudeMC = maxLongitudeMC;
            this.newHighLimit = newHighLimit;
        }

        private String name;

        private  int xOffset;
        private  int yOffset;
        private  int zOffset;
        private  int maxMcBuildHeight;
        private  int overlappingPlus;
        private  int overlappingMinus;

        private  int minLatitudeMC;
        private  int maxLatitudeMC;
        private  int minLongitudeMC;
        private  int maxLongitudeMC;
        private  boolean newHighLimit;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getXOffset() {
            return xOffset;
        }

        public void setxOffset(int xOffset) {
            this.xOffset = xOffset;
        }

        public int getYOffset() {
            return yOffset;
        }

        public void setyOffset(int yOffset) {
            this.yOffset = yOffset;
        }

        public int getZOffset() {
            return zOffset;
        }

        public void setzOffset(int zOffset) {
            this.zOffset = zOffset;
        }

        public int getMaxMcBuildHeight() {
            return maxMcBuildHeight;
        }

        public void setMaxMcBuildHeight(int maxMcBuildHeight) {
            this.maxMcBuildHeight = maxMcBuildHeight;
        }

        public int getOverlappingPlus() {
            return overlappingPlus;
        }

        public void setOverlappingPlus(int overlappingPlus) {
            this.overlappingPlus = overlappingPlus;
        }

        public int getOverlappingMinus() {
            return overlappingMinus;
        }

        public void setOverlappingMinus(int overlappingMinus) {
            this.overlappingMinus = overlappingMinus;
        }

        public int getMinLatitudeMC() {
            return minLatitudeMC;
        }

        public void setMinLatitudeMC(int minLatitudeMC) {
            this.minLatitudeMC = minLatitudeMC;
        }

        public int getMaxLatitudeMC() {
            return maxLatitudeMC;
        }

        public void setMaxLatitudeMC(int maxLatitudeMC) {
            this.maxLatitudeMC = maxLatitudeMC;
        }

        public int getMinLongitudeMC() {
            return minLongitudeMC;
        }

        public void setMinLongitudeMC(int minLongitudeMC) {
            this.minLongitudeMC = minLongitudeMC;
        }

        public int getMaxLongitudeMC() {
            return maxLongitudeMC;
        }

        public void setMaxLongitudeMC(int maxLongitudeMC) {
            this.maxLongitudeMC = maxLongitudeMC;
        }

        public boolean isNewHighLimit() {
            return newHighLimit;
        }

        public void setNewHighLimit(boolean newHighLimit) {
            this.newHighLimit = newHighLimit;
        }
    }
}
