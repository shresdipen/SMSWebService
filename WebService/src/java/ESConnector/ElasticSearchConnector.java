package ESConnector;

import org.codehaus.groovy.grails.commons.ConfigurationHolder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * Created with IntelliJ IDEA.
 * User: dipen
 * Date: 11/23/13
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
class ElasticSearchConnector {
    private Client client;

    public ElasticSearchConnector(String url, int port, String clusterName, String nodeName) {
//        ConfigurationHolder CH;
//        System.out.println(ServerConfigs.);;
        Settings settings = ImmutableSettings.settingsBuilder()
                .put("cluster.name", clusterName)
                .put("node.name", nodeName)
                .build();
        Client client =    new TransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress(url, port));
    }

    public Client getClient() {return this.client;}
}