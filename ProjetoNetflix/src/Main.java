import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import Control.CatalogoManager;
import Model.CatalogoFilmes;

public class Main {

    public static void main(String[] args) throws Exception {

        // 1. Instancia a classe de dados (que agora só contém a lista)
        CatalogoFilmes catalogoDeFilmes = new CatalogoFilmes();

        // 2. Instancia o gerenciador (a MBean), passando a classe de dados para ele
        CatalogoManager gerenciadorDoCatalogo = new CatalogoManager(catalogoDeFilmes);

        // 3. Obtém o MBeanServer e cria o nome do objeto para o registro
        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.netflix.catalogo:type=CatalogoManager");

        // 4. Registra a MBean no MBeanServer
        mbeanServer.registerMBean(gerenciadorDoCatalogo, objectName);

        System.out.println("MBean 'CatalogoManager' registrado com sucesso.");
        System.out.println("Use o JConsole para se conectar e gerenciar o catálogo.");

        // Mantém a aplicação em execução
        Thread.sleep(Long.MAX_VALUE);
    }
}