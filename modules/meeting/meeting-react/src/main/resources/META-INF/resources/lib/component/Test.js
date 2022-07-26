import { TextField, Checkbox, Paper } from "@mui/material";

import React from "react";
const Test = () => {

    return (
        <div>
            <Paper elevation={3}>
                <TextField id="outlined-basic" label="Outlined" variant="outlined" />
                <Checkbox defaultChecked />
                <Checkbox />
                <Checkbox disabled />
                <Checkbox disabled checked />
            </Paper>
        </div>
    );
}
export default Test;