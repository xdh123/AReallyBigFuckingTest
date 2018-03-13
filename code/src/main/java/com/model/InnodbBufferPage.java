package com.model;

public class InnodbBufferPage {
    private Long poolId;

    private Long blockId;

    private Long space;

    private Long pageNumber;

    private String pageType;

    private Long flushType;

    private Long fixCount;

    private String isHashed;

    private Long newestModification;

    private Long oldestModification;

    private Long accessTime;

    private String tableName;

    private String indexName;

    private Long numberRecords;

    private Long dataSize;

    private Long compressedSize;

    private String pageState;

    private String ioFix;

    private String isOld;

    private Long freePageClock;

    public Long getPoolId() {
        return poolId;
    }

    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Long getSpace() {
        return space;
    }

    public void setSpace(Long space) {
        this.space = space;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType == null ? null : pageType.trim();
    }

    public Long getFlushType() {
        return flushType;
    }

    public void setFlushType(Long flushType) {
        this.flushType = flushType;
    }

    public Long getFixCount() {
        return fixCount;
    }

    public void setFixCount(Long fixCount) {
        this.fixCount = fixCount;
    }

    public String getIsHashed() {
        return isHashed;
    }

    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed == null ? null : isHashed.trim();
    }

    public Long getNewestModification() {
        return newestModification;
    }

    public void setNewestModification(Long newestModification) {
        this.newestModification = newestModification;
    }

    public Long getOldestModification() {
        return oldestModification;
    }

    public void setOldestModification(Long oldestModification) {
        this.oldestModification = oldestModification;
    }

    public Long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    public Long getNumberRecords() {
        return numberRecords;
    }

    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public Long getCompressedSize() {
        return compressedSize;
    }

    public void setCompressedSize(Long compressedSize) {
        this.compressedSize = compressedSize;
    }

    public String getPageState() {
        return pageState;
    }

    public void setPageState(String pageState) {
        this.pageState = pageState == null ? null : pageState.trim();
    }

    public String getIoFix() {
        return ioFix;
    }

    public void setIoFix(String ioFix) {
        this.ioFix = ioFix == null ? null : ioFix.trim();
    }

    public String getIsOld() {
        return isOld;
    }

    public void setIsOld(String isOld) {
        this.isOld = isOld == null ? null : isOld.trim();
    }

    public Long getFreePageClock() {
        return freePageClock;
    }

    public void setFreePageClock(Long freePageClock) {
        this.freePageClock = freePageClock;
    }
}