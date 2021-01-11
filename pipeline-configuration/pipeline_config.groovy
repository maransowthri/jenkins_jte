libraries{
    deployment
    infrastructure
}

stages{
    continuous_integration{
        setup_nodes
        setup_env
    }
}