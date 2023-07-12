
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SocialServiceSnsManager from "./components/listers/SocialServiceSnsCards"
import SocialServiceSnsDetail from "./components/listers/SocialServiceSnsDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/socialServices/sns',
                name: 'SocialServiceSnsManager',
                component: SocialServiceSnsManager
            },
            {
                path: '/socialServices/sns/:id',
                name: 'SocialServiceSnsDetail',
                component: SocialServiceSnsDetail
            },



    ]
})
