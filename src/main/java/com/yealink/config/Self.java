package com.yealink.config;

import com.ecwid.consul.v1.agent.model.Member;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@ConfigurationProperties("consul")
@Component
public class Self {

    public enum LogLevel {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERR
    }

    @Data
    public static class Config {

        @JsonProperty("Datacenter")
        private String datacenter;

        @JsonProperty("NodeName")
        private String nodeName;

        @JsonProperty("Revision")
        private String revision;

        @JsonProperty("Server")
        private boolean server;

        @JsonProperty("Version")
        private String version;

    }

    @Data
    public static class DebugConfig {

        @JsonProperty("Bootstrap")
        private boolean bootstrap;

        @JsonProperty("DataDir")
        private String dataDir;

        @JsonProperty("DNSRecursor")
        private String dnsRecursor;

        @JsonProperty("DNSDomain")
        private String dnsDomain;

        @JsonProperty("LogLevel")
        private LogLevel logLevel;

        @JsonProperty("NodeID")
        private String nodeId;

        @JsonProperty("ClientAddrs")
        private String[] clientAddresses;

        @JsonProperty("BindAddr")
        private String bindAddress;

        @JsonProperty("LeaveOnTerm")
        private boolean leaveOnTerm;

        @JsonProperty("SkipLeaveOnInt")
        private boolean skipLeaveOnInt;

        @JsonProperty("EnableDebug")
        private boolean enableDebug;

        @JsonProperty("VerifyIncoming")
        private boolean verifyIncoming;

        @JsonProperty("VerifyOutgoing")
        private boolean verifyOutgoing;

        @JsonProperty("CAFile")
        private String caFile;

        @JsonProperty("CertFile")
        private String certFile;

        @JsonProperty("KeyFile")
        private String keyFile;

        @JsonProperty("UiDir")
        private String uiDir;

        @JsonProperty("PidFile")
        private String pidFile;

        @JsonProperty("EnableSyslog")
        private boolean enableSyslog;

        @JsonProperty("RejoinAfterLeave")
        private boolean rejoinAfterLeave;


    }

    @JsonProperty("Config")
    private Config config;

    @JsonProperty("DebugConfig")
    private DebugConfig debugConfig;

    @JsonProperty("Member")
    private Member member;
}
