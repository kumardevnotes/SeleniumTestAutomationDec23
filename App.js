import React, { useState, useRef } from 'react';
import { AgGridReact } from 'ag-grid-react';
import { ModuleRegistry, AllCommunityModule } from 'ag-grid-community';
import 'ag-grid-community/styles/ag-grid.css';
import 'ag-grid-community/styles/ag-theme-alpine.css';

// Register all community modules
ModuleRegistry.registerModules([AllCommunityModule]);

function App() {
  const [rowData, setRowData] = useState([
    { Name: 'Device A', Model: 'Model X', Deployment: 'Deployed', SerialNumber: '12345', Template: 'Template 1', TemplateVersion: 'v1.0', Schedule: 'Daily', LastHeartBeat: '2023-10-01' },
    { Name: 'Device B', Model: 'Model Y', Deployment: 'Pending', SerialNumber: '67890', Template: 'Template 2', TemplateVersion: 'v2.0', Schedule: 'Weekly', LastHeartBeat: '2023-10-02' },
    { Name: 'Device C', Model: 'Model Z', Deployment: 'Deployed', SerialNumber: '54321', Template: 'Template 3', TemplateVersion: 'v1.5', Schedule: 'Monthly', LastHeartBeat: '2023-10-03' },
    { Name: 'Device D', Model: 'Model A', Deployment: 'Deployed', SerialNumber: '11111', Template: 'Template 4', TemplateVersion: 'v2.1', Schedule: 'Daily', LastHeartBeat: '2023-10-04' },
    { Name: 'Device E', Model: 'Model B', Deployment: 'Pending', SerialNumber: '22222', Template: 'Template 5', TemplateVersion: 'v3.0', Schedule: 'Weekly', LastHeartBeat: '2023-10-05' },
    { Name: 'Device F', Model: 'Model C', Deployment: 'Deployed', SerialNumber: '33333', Template: 'Template 6', TemplateVersion: 'v1.2', Schedule: 'Monthly', LastHeartBeat: '2023-10-06' },
    { Name: 'Device G', Model: 'Model D', Deployment: 'Pending', SerialNumber: '44444', Template: 'Template 7', TemplateVersion: 'v2.3', Schedule: 'Daily', LastHeartBeat: '2023-10-07' },
    { Name: 'Device H', Model: 'Model E', Deployment: 'Deployed', SerialNumber: '55555', Template: 'Template 8', TemplateVersion: 'v1.8', Schedule: 'Weekly', LastHeartBeat: '2023-10-08' },
    { Name: 'Device I', Model: 'Model F', Deployment: 'Pending', SerialNumber: '66666', Template: 'Template 9', TemplateVersion: 'v2.5', Schedule: 'Monthly', LastHeartBeat: '2023-10-09' },
    { Name: 'Device J', Model: 'Model G', Deployment: 'Deployed', SerialNumber: '77777', Template: 'Template 10', TemplateVersion: 'v3.1', Schedule: 'Daily', LastHeartBeat: '2023-10-10' },
    { Name: 'Device K', Model: 'Model H', Deployment: 'Pending', SerialNumber: '88888', Template: 'Template 11', TemplateVersion: 'v1.4', Schedule: 'Weekly', LastHeartBeat: '2023-10-11' },
    { Name: 'Device L', Model: 'Model I', Deployment: 'Deployed', SerialNumber: '99999', Template: 'Template 12', TemplateVersion: 'v2.7', Schedule: 'Monthly', LastHeartBeat: '2023-10-12' },
    { Name: 'Device M', Model: 'Model J', Deployment: 'Pending', SerialNumber: '10101', Template: 'Template 13', TemplateVersion: 'v1.9', Schedule: 'Daily', LastHeartBeat: '2023-10-13' },
    { Name: 'Device N', Model: 'Model K', Deployment: 'Deployed', SerialNumber: '20202', Template: 'Template 14', TemplateVersion: 'v2.2', Schedule: 'Weekly', LastHeartBeat: '2023-10-14' },
    { Name: 'Device O', Model: 'Model L', Deployment: 'Pending', SerialNumber: '30303', Template: 'Template 15', TemplateVersion: 'v3.2', Schedule: 'Monthly', LastHeartBeat: '2023-10-15' },
    { Name: 'Device P', Model: 'Model M', Deployment: 'Deployed', SerialNumber: '40404', Template: 'Template 16', TemplateVersion: 'v1.6', Schedule: 'Daily', LastHeartBeat: '2023-10-16' },
    { Name: 'Device Q', Model: 'Model N', Deployment: 'Pending', SerialNumber: '50505', Template: 'Template 17', TemplateVersion: 'v2.4', Schedule: 'Weekly', LastHeartBeat: '2023-10-17' },
    { Name: 'Device R', Model: 'Model O', Deployment: 'Deployed', SerialNumber: '60606', Template: 'Template 18', TemplateVersion: 'v1.7', Schedule: 'Monthly', LastHeartBeat: '2023-10-18' },
    { Name: 'Device S', Model: 'Model P', Deployment: 'Pending', SerialNumber: '70707', Template: 'Template 19', TemplateVersion: 'v2.6', Schedule: 'Daily', LastHeartBeat: '2023-10-19' },
    { Name: 'Device T', Model: 'Model Q', Deployment: 'Deployed', SerialNumber: '80808', Template: 'Template 20', TemplateVersion: 'v3.3', Schedule: 'Weekly', LastHeartBeat: '2023-10-20' },
    { Name: 'Device U', Model: 'Model R', Deployment: 'Pending', SerialNumber: '90909', Template: 'Template 21', TemplateVersion: 'v1.3', Schedule: 'Monthly', LastHeartBeat: '2023-10-21' },
    { Name: 'Device V', Model: 'Model S', Deployment: 'Deployed', SerialNumber: '12121', Template: 'Template 22', TemplateVersion: 'v2.8', Schedule: 'Daily', LastHeartBeat: '2023-10-22' },
  ]);

  const [columnDefs] = useState([
    { field: 'Name', sortable: true, filter: true, checkboxSelection: true },
    { field: 'Model', sortable: true, filter: true },
    { field: 'Deployment', sortable: true, filter: true },
    { field: 'SerialNumber', sortable: true, filter: true },
    { field: 'Template', sortable: true, filter: true },
    { field: 'TemplateVersion', sortable: true, filter: true },
    { field: 'Schedule', sortable: true, filter: true },
    { field: 'LastHeartBeat', sortable: true, filter: true },
  ]);

  const gridRef = useRef();

  const handleDelete = () => {
    const selectedNodes = gridRef.current.api.getSelectedNodes();
    if (selectedNodes.length === 0) return;

    // Show Yes/No popup
    const confirmDelete = window.confirm("Are you sure you want to delete the selected rows?");
    if (confirmDelete) {
      const selectedData = selectedNodes.map(node => node.data);
      const newData = rowData.filter(row => !selectedData.includes(row));
      setRowData(newData);
    }
  };

  return (
    <div className="App">
      <h1>Device Table</h1>
      <button
        onClick={handleDelete}
        disabled={!gridRef.current || gridRef.current.api.getSelectedNodes().length === 0}
        style={{ marginBottom: '10px', backgroundColor: 'blue', color: 'white', padding: '8px 16px', border: 'none', borderRadius: '4px', cursor: 'pointer' }}
      >
        Delete
      </button>
      <div className="ag-theme-alpine" style={{ height: 400, width: '100%' }}>
        <AgGridReact
          ref={gridRef}
          rowData={rowData}
          columnDefs={columnDefs}
          rowSelection="multiple"
          pagination={true}
          paginationPageSize={5}
        />
      </div>
    </div>
  );
}

export default App;
