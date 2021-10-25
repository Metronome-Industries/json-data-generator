/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.acesinc.data.json.generator.log;

import java.util.Map;

/**
 *
 * @author andrewserff
 */
public interface EventLogger {
    Map<String, Object> logEvent(String event, Map<String, Object> producerConfig);
    void shutdown();
}
