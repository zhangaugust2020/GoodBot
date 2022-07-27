import $ from 'jquery';

export default {
    state: { // 数据关键字
        id: "",
        username: "",
        photo: "",
        token: "",
        is_login: false,
    },
    getters: {
    },
    mutations: { // 修改数据
        updateUser(state, user) {
            state.id = user.id;
            state.username = user.username;
            state.photo = user.photo;
            state.is_login = user.is_login;
        },
        updateToken(state, token) {
            state.token = token;
        },
        logout(state) {
            state.id = "";
            state.username = "";
            state.photo = "";
            state.token = "";
            state.is_login = false;
        }
    },
    actions: { // 修改state的函数
        login(context, data) {
            $.ajax({
                url: "http://127.0.0.1:3000/user/account/token",
                type: "post",
                data: {
                    username: data.username,
                    password: data.password,
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        // 在 actions 中调用 mutations 中的函数 使用 commit() 方法
                        context.commit("updateToken", resp.token);
                        data.success(resp);
                    } else {
                        data.error(resp);
                    }
                },
                error(resp) {
                    data.error(resp);
                }
            });
        },
        getinfo(context, data) {
            $.ajax({
                url: "http://127.0.0.1:3000/user/account/info",
                type: "get",
                headers: {
                    Authorization: "Bearer " + context.state.token,
                },
                data: {
                    username: 'zlx',
                    password: '123456',
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        context.commit("updateUser", {
                            ...resp,
                            is_login: true,
                        });
                        data.success(resp)
                    } else {
                        data.error(resp);
                    }
                },
                error(resp) {
                    data.error(resp);
                }
            });
        },
        logout(context) {
            context.commit("logout");
        }
    },
    modules: {
    }
}