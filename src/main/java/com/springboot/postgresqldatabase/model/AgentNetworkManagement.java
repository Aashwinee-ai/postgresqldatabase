package com.springboot.postgresqldatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "AgentNetworkManagement")
public class AgentNetworkManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "agentmanagerid")
    private String AgentManagerid;
    @Column(name = "superagentid")
    private String SuperAgentid;
    @Column(name = "agentid")
    private String Agentid;
    @Column(name = "agentmembersid")
    private String AgentMembersid;

    public AgentNetworkManagement(long id, String agentManagerid, String superAgentid, String agentid, String agentMembersid) {
        this.id = id;
        AgentManagerid = agentManagerid;
        SuperAgentid = superAgentid;
        Agentid = agentid;
        AgentMembersid = agentMembersid;
    }

    public AgentNetworkManagement() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAgentManagerid() {
        return AgentManagerid;
    }

    public void setAgentManagerid(String agentManagerid) {
        AgentManagerid = agentManagerid;
    }

    public String getSuperAgentid() {
        return SuperAgentid;
    }

    public void setSuperAgentid(String superAgentid) {
        SuperAgentid = superAgentid;
    }

    public String getAgentid() {
        return Agentid;
    }

    public void setAgentid(String agentid) {
        Agentid = agentid;
    }

    public String getAgentMembersid() {
        return AgentMembersid;
    }

    public void setAgentMembersid(String agentMembersid) {
        AgentMembersid = agentMembersid;
    }






}
